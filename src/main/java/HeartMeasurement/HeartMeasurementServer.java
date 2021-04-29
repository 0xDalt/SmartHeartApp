package HeartMeasurement;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;


import HeartMeasurement.HeartMeasurementGrpc.HeartMeasurementImplBase;
import MyJmdns.ServiceRegistration;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class HeartMeasurementServer extends HeartMeasurementImplBase {

	private static final Logger logger = Logger.getLogger(HeartMeasurementServer.class.getName());

	public static void main(String[] args) {
		
		HeartMeasurementServer HeartMeasurementserver = new HeartMeasurementServer();
		
		/*Properties prop = HeartMeasurementServer.getProperties();
	
		HeartMeasurementServer.registerService(prop);
		
		int port = Integer.valueOf(prop.getProperty("service_port"));*/
		
		int port = 50053;
		String service_type = "_grpc._tcp.local.";
		String service_name = "GrpcServer";
		ServiceRegistration ssr = new ServiceRegistration();
		ssr.run(port, service_type, service_name);
	

	    
		try {
			Server server = ServerBuilder.forPort(port)
			    .addService(HeartMeasurementserver)
			    .build()
			    .start();
			System.out.println("\nServer HM Started");
			
			 server.awaitTermination();

			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    logger.info("Server started, listening on " + port);
	}
	    		    
	   

	
	private static void registerService(Properties prop) {
		// TODO Auto-generated method stub
		
	}




	private static Properties getProperties() {
		// TODO Auto-generated method stub
		return null;
	}




	
	/*public void recordHeartMeasurement(HeartMeasurementRequest request1,  StreamObserver<HeartMeasurementResponse> responseObserver1) {
		    
		HeartMeasurement.Patient patient= request1.getPatient(0);
		// HeartMeasurementResponse reply = HeartMeasurementResponse.newBuilder().setBpm(patient.getBpm());
	     
		// responseObserver.onNext(reply);
	     
	    // responseObserver.onCompleted();
	@Override
	public void recordHeartMeasurement(HeartMeasurementRequest request, StreamObserver<HeartMeasurementResponse> responseObserver){
		*/
	
}




