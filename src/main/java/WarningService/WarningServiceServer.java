package WarningService;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

import com.google.protobuf.Descriptors.FieldDescriptor;

import WarningService.WarningServiceGrpc.WarningServiceImplBase;
import MyJmdns.ServiceRegistration;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class WarningServiceServer extends WarningServiceImplBase {

	private static final Logger logger = Logger.getLogger(WarningServiceServer.class.getName());

	public static void main(String[] args) {
		
		WarningServiceServer WarningServiceserver = new WarningServiceServer();
		
		/*Properties prop = WarningServiceServer.getProperties();
	
		WarningServiceServer.registerService(prop);
		
		int port = Integer.valueOf(prop.getProperty("service_port"));*/
		
		int port = 50055;
		String service_type = "_grpc._tcp.local.";
		String service_name = "AlertService";
		ServiceRegistration ssr = new ServiceRegistration();
		ssr.run(port, service_type, service_name);
	

	    
		try {
			Server server = ServerBuilder.forPort(port)
			    .addService(WarningServiceserver)
			    .build()
			    .start();
			System.out.println("\nServer Warning Started");
			
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




	
	

	// 
	
	//public void recordWarningService(WarningServiceRequest request,  StreamObserver<WarningServiceResponse> responseObserver) {
		    
		//Map<FieldDescriptor, Object> MedicalRecords= request.getAllFields();
		// WarningServiceResponse reply = WarningServiceResponse.newBuilder().setBpm(patient.getBpm());
	     
		// responseObserver.onNext(reply);
	     
	    // responseObserver.onCompleted();
	
}
