package RecordingService;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

import com.google.protobuf.Descriptors.FieldDescriptor;

import HeartBeat.HeartbeatRequest;
import HeartBeat.HeartbeatResponse;
import MyJmdns.ServiceRegistration;
import RecordingService.RecordingServiceGrpc.RecordingServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class RecordingServiceServer extends RecordingServiceImplBase {

	private static final Logger logger = Logger.getLogger(RecordingServiceServer.class.getName());
	//private static Patient[] patients;
	public static void main(String[] args) {
		//Patient p= new Patient();//fill array
		RecordingServiceServer RecordingServiceserver = new RecordingServiceServer();
		
		/*Properties prop = RecordingServiceServer.getProperties();
	
		RecordingServiceServer.registerService(prop);
		
		int port = Integer.valueOf(prop.getProperty("service_port"));*/
		
		int port2 = 50054;
		String service_type = "_grpc._tcp.local.";
		String service_name = "RecordingRecords";
		ServiceRegistration ssr = new ServiceRegistration();
		ssr.run(port2, service_type, service_name);
	

	    
		try {
			Server server = ServerBuilder.forPort(port2)
			    .addService(RecordingServiceserver)
			    .build()
			    .start();
			System.out.println("\nServer Rec Started");
			
			 server.awaitTermination();

			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    logger.info("Server started, listening on " + port2);
	}
	    		    
	   

	
	private static void registerService(Properties prop) {
		// TODO Auto-generated method stub
		
	}




	private static Properties getProperties() {
		// TODO Auto-generated method stub
		return null;
	}


	public void getMedicalRecords(MedicalRecordRequest request,StreamObserver<MedicalRecordResponse> responseObserver) {
		
	}

	public void getPatientRecords(PatientRecordsRequest request,StreamObserver<PatientRecordsResponse> responseObserver) {
		
	}


	public void setBpm(SetPatientBpmRequest request,StreamObserver<PatientResponse> responseObserver) {
		//for loop through patients array
		//patient=find patient with id =request.getiD
		//break loop.
		//set bpm value for that patient 
		//patientResponse.setPatient(patient)
	
		
	}
	
	

	// 
	
	//public void recordRecordingService(RecordingServiceRequest request,  StreamObserver<RecordingServiceResponse> responseObserver) {
		    
		//Map<FieldDescriptor, Object> MedicalRecords= request.getAllFields();
		// RecordingServiceResponse reply = RecordingServiceResponse.newBuilder().setBpm(patient.getBpm());
	     
		// responseObserver.onNext(reply);
	     
	    // responseObserver.onCompleted();
	
}



