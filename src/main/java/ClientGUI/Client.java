package ClientGUI;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.jmdns.ServiceInfo;

import HeartMeasurement.HeartMeasurementGrpc;
import HeartMeasurement.HeartMeasurementGrpc.HeartMeasurementBlockingStub;
import HeartMeasurement.HeartMeasurementRequest;
import HeartMeasurement.HeartMeasurementResponse;
import MyJmdns.ServiceDiscovery; 
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class Client {

	private static final Logger logger = Logger.getLogger(Client.class.getName());

		  
	public static void main(String[] args) throws Exception {
		
		ServiceInfo serviceInfo;
		String service_type = "_grpc._tcp.local.";
		serviceInfo = ServiceDiscovery.run(service_type);
		int port = serviceInfo.getPort();
		String host = "localhost";
		//int port = 50051;
		
		ManagedChannel channel = ManagedChannelBuilder.
				forAddress(host, port)
				.usePlaintext()
				.build();
		
		HeartMeasurementBlockingStub  blockingStub = HeartMeasurementGrpc.newBlockingStub(channel);
				
		
	    
	   try {
	    	 int bpm = 120;
	    	 HeartMeasurement.Patient patient = HeartMeasurement.Patient.newBuilder()
	    		.setId(1).setName("John")
	    		.setRiskLevel("low")
	    		.setBpm(bpm)
	    	 	.build();
	    	 HeartMeasurementRequest request = HeartMeasurementRequest.newBuilder().addPatient(patient).build();
	    	 
	    	 HeartMeasurementResponse response = blockingStub.recordHeartMeasurement(request);
	    	 
	    	 logger.info("bpm: " + response.getBpm());
	    	 
	    } catch (StatusRuntimeException e) {
		    logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		    
		    return;		
		    
	    } finally {
	    	//shutdown channel
	    	channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	    }
	/*    
		//Now create second Channel
	    Thread.sleep(10000); //Sleep here is purely to pause the printout to the console
		
		ServiceInfo serviceInfo2;
		String service_type2 = "_grpc2._tcp.local.";
		serviceInfo2 = SimpleServiceDiscovery.run(service_type2);
		int port2 = serviceInfo2.getPort();
		String host2 = "localhost";
		//int port = 50051;
		
		ManagedChannel channel2 = ManagedChannelBuilder.
				forAddress(host2, port2)
				.usePlaintext()
				.build();
		
		GreeterBlockingStub  blockingStub2 = GreeterGrpc.newBlockingStub(channel2);
		
	    
	    try {
	    	 String name = "Joe and Ann";
	    	 HelloRequest request = HelloRequest.newBuilder().setName(name).build();
	    	 
	    	 HelloReply response = blockingStub2.sayHello(request);
	    	 
	    	 logger.info("Greeting: " + response.getMessage());
	    	 
	    } catch (StatusRuntimeException e) {
		    logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		    
		    return;		
		    
	    } finally {
	    	//shutdown channel
	    	channel2.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	    }

	    
	    */
	  }
	
	
}
