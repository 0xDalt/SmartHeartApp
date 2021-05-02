package Servers.java;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

import com.google.protobuf.Descriptors.FieldDescriptor;

import WarningService.WarningServiceGrpc;
import WarningService.WarningServiceGrpc.WarningServiceImplBase;
import WarningService.WarningServiceRequest;
import WarningService.WarningServiceResponse;
import MyJmdns.ServiceRegistration;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.CallStreamObserver;
import io.grpc.stub.StreamObserver;
import patient.Patient;

public class WarningServiceServer extends WarningServiceImplBase {

	private static final Logger logger = Logger.getLogger(WarningServiceServer.class.getName());

	public static void main(String[] args) {
		int Low_Risk;
		int High_Risk;
		String Alert;
		Alert = "Warning";
		WarningServiceServer WarningServiceserver = new WarningServiceServer();

		int port3 = 50055;
		String service_type = "_grpc._tcp.local.";
		String service_name = "AlertService";
		ServiceRegistration ssr = new ServiceRegistration();
		ssr.run(port3, service_type, service_name);

		try {
			Server server = ServerBuilder.forPort(port3).addService(WarningServiceserver).build().start();
			System.out.println("\nServer Warning Started");

			server.awaitTermination();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		logger.info("Server started, listening on " + port3);
	}

	private static String getAlertMessage(int riskLevel) {

		switch (riskLevel) {
		case 1:
			return " low..";
		case 2:
			return " medium";
		case 3:
			return " Moderate";
		case 4:
			return " High ";
		default:
			return "";
		}
	}

	public StreamObserver<WarningServiceRequest> Alert(StreamObserver<WarningServiceResponse> responseObserver) {

		return new StreamObserver<WarningServiceRequest>() {

			@Override
			public void onNext(WarningServiceRequest msg) {
				System.out.println("receiving patient id: " + msg.getPatientId());
				Patient patient = Patient.getPatient(msg.getPatientId());
				int riskLevel = patient.getRiskLevel();
				WarningServiceResponse reply = WarningServiceResponse.newBuilder().setRiskLevel(riskLevel)
						.setAlert(getAlertMessage(riskLevel)).build();

				responseObserver.onNext(reply);

			}

			@Override
			public void onError(Throwable t) {

				t.printStackTrace();

			}

			@Override
			public void onCompleted() {
				System.out.println("receiving convertBase completed ");

				// completed too
				responseObserver.onCompleted();
			}

		};
	}
}
