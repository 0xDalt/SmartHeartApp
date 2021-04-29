package HeartBeat;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Logger;

import HeartBeat.HeartBeatGrpc.HeartBeatImplBase;
import MyJmdns.ServiceRegistration;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class HeartBeatServer extends HeartBeatImplBase {

	private static final Logger logger = Logger.getLogger(HeartBeatServer.class.getName());

	public static void main(String[] args) {
		
		HeartBeatServer HeartBeatserver = new HeartBeatServer();
		
		/*Properties prop = HeartBeatServer.getProperties();
	
		HeartBeatServer.registerService(prop);
		
		int port = Integer.valueOf(prop.getProperty("service_port"));*/
		
		int port4 = 50056;
		String service_type = "_grpc._tcp.local.";
		String service_name = "HeartBeat Server";
		ServiceRegistration ssr = new ServiceRegistration();
		ssr.run(port4, service_type, service_name);
	

	    
		try {
			Server server = ServerBuilder.forPort(port4)
			    .addService(HeartBeatserver)
			    .build()
			    .start();
			System.out.println("\nServer HeartBeat Started");
			
			 server.awaitTermination();

			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    logger.info("Server started, listening on " + port4);
	}
	    		    
	   

	
	private static void registerService(Properties prop) {
		// TODO Auto-generated method stub
		
	}




	private static Properties getProperties() {
		// TODO Auto-generated method stub
		return null;
	}
	public void generateHeartBeat(HeartbeatRequest request,StreamObserver<HeartbeatResponse> responseObserver){


		System.out.printf("receiving generated heartbeat %d from: %d to: %d \n",
				request.getCurrentRate(), request.getMin(), request.getMax()  );

		Random rand = new Random();
		HeartbeatResponse reply = null;

		for(int i=0; i<request.getCurrentRate(); i++) {

			int beat = rand.nextInt(request.getMax() - request.getMin()) + request.getMin() + 1;

			 reply = HeartbeatResponse.newBuilder().setBpm(beat).build();

			try {
				//wait for a second
				Thread.sleep(1000);
			} catch (InterruptedException e){
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		responseObserver.onNext(reply);
		
		responseObserver.onCompleted();
	}
}
