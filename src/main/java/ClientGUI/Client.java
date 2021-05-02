package ClientGUI;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.jmdns.ServiceInfo;

import HeartBeat.HeartBeatGrpc;
import HeartBeat.HeartBeatGrpc.HeartBeatBlockingStub;
import HeartBeat.HeartbeatRequest;
import HeartBeat.HeartbeatResponse;
import MyJmdns.ServiceDiscovery;
import RecordingService.RecordingServiceGrpc;
import RecordingService.RecordingServiceGrpc.RecordingServiceBlockingStub;
import Servers.java.HeartBeatServer;
import WarningService.WarningServiceGrpc.WarningServiceBlockingStub;
import WarningService.WarningServiceGrpc.WarningServiceFutureStub;
import WarningService.WarningServiceGrpc.WarningServiceStub;
import WarningService.WarningServiceRequest;
import WarningService.WarningServiceResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import patient.Patient;
import javax.swing.JOptionPane;

public class Client {

	private static final Logger logger = Logger.getLogger(Client.class.getName());
	private static HeartBeatBlockingStub blockingStub;
	private static RecordingServiceBlockingStub RecordingServiceStub;
	private static WarningServiceStub warningServiceStub;
	private static final Integer THRESHOLD = 100;

	public static void main(String[] args) throws Exception {

		
		ServiceInfo serviceInfo;
		String service_type = "_grpc._tcp.local.";
		serviceInfo = ServiceDiscovery.run(service_type);
		int port = serviceInfo.getPort();
		String host = "localhost";

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext().build();

		// stubs -- 
		blockingStub = HeartBeatGrpc.newBlockingStub(channel);

		//HashMap<String, Integer> bpm = 
		getHeartRates();

		ServiceInfo serviceInfo2 = ServiceDiscovery.run(service_type);
		serviceInfo2 = ServiceDiscovery.run(service_type);
		int port2 = serviceInfo2.getPort();
		
		ManagedChannel channel2 = ManagedChannelBuilder.forAddress(host, port2).usePlaintext().build();
		// int port = 50056;

		ManagedChannel channel1 = ManagedChannelBuilder
				.forAddress("localhost", 50054)
			.usePlaintext()
				.build();

		// stubs
		RecordingServiceStub = RecordingServiceGrpc.newBlockingStub(channel2);
		
		// second Channel
		Thread.sleep(10000); // Sleep

		/*
		 
		 * ServiceInfo serviceInfo; serviceInfo = ServiceDiscovery.run(service_type);
		 * int port2 = serviceInfo.getPort(); String host1 = "localhost"; //int port =
		 * 50054;
		 */

		// ManagedChannel channel11 = ManagedChannelBuilder.
		// forAddress(host1, port2)
		// .usePlaintext()
		// .build();

		warning();

		try {

		} catch (StatusRuntimeException e) {
			logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());

			return;

		} finally {
			// shutdown channel
			// channel2.shutdown().awaitTermination(5, TimeUnit.SECONDS);
		}

		Thread.sleep(20000);

		// add in HeartBeat info.

	}


	public static HashMap<String, Integer> getHeartRates() {

		HashMap<String, Integer> patientNameToBpm = new HashMap<String, Integer>();
		for (int id : Patient.db.keySet()) {
			HeartbeatRequest request = HeartbeatRequest.newBuilder().setPatientId(id).build();
			HeartbeatResponse response = blockingStub.getRate(request);
			Patient patient = Patient.getPatient(id);
			patientNameToBpm.put(patient.getName(), response.getBpm());
			System.out.println(patient.getName() + "'s heart rate: " + response.getBpm());
		}
		return patientNameToBpm;
	}

	public static void warning() {

		StreamObserver<WarningServiceResponse> responseObserver = new StreamObserver<WarningServiceResponse>() {

			@Override
			public void onNext(WarningServiceResponse msg) {
				System.out.println("your risk is" + msg.getAlert() + " ");
			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();

			}

			@Override
			public void onCompleted() {
			}

		};
		StreamObserver<WarningServiceRequest> requestObserver = warningServiceStub.alert(responseObserver);

		requestObserver.onNext(WarningServiceRequest.newBuilder().setPatientId(2).build());
		requestObserver.onNext(WarningServiceRequest.newBuilder().setPatientId(3).build());
		requestObserver.onNext(WarningServiceRequest.newBuilder().setPatientId(4).build());
		requestObserver.onNext(WarningServiceRequest.newBuilder().setPatientId(62).build());
		requestObserver.onNext(WarningServiceRequest.newBuilder().setPatientId(77).build());
		requestObserver.onCompleted();

	}
}
