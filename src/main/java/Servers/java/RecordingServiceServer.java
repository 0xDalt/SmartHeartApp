package Servers.java;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import MyJmdns.ServiceRegistration;
import RecordingService.PatientRecordsRequest;
import RecordingService.PatientRecordsResponse;
import RecordingService.RecordingServiceGrpc.RecordingServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import patient.Patient;

public class RecordingServiceServer extends RecordingServiceImplBase {

	private static final Logger logger = Logger.getLogger(RecordingServiceServer.class.getName());

	public static void main(String[] args) {

		RecordingServiceServer RecordingServiceserver = new RecordingServiceServer();

		int port2 = 50054;
		String service_type = "_grpc._tcp.local.";
		String service_name = "RecordingRecords";
		ServiceRegistration ssr = new ServiceRegistration();
		ssr.run(port2, service_type, service_name);

		try {
			Server server = ServerBuilder.forPort(port2).addService(RecordingServiceserver).build().start();
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

	public void getRecords(PatientRecordsRequest request, StreamObserver<PatientRecordsResponse> responseObserver) {
		int min = request.getMinBpm();
		int max = request.getMaxBpm();
		for (Patient patient : Patient.db.values()) {
			int bpm = patient.getBpm();
			if (bpm >= min && bpm <= max) {
				responseObserver.onNext(PatientRecordsResponse.newBuilder().setId(patient.getId()).build());
			}
		}

		responseObserver.onCompleted();
	}
}
