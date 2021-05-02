package Servers.java;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import HeartBeat.HeartBeatGrpc.HeartBeatImplBase;
import HeartBeat.HeartbeatRequest;
import HeartBeat.HeartbeatResponse;
import MyJmdns.ServiceRegistration;
import patient.Patient;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class HeartBeatServer extends HeartBeatImplBase {

	private static final Logger logger = Logger.getLogger(HeartBeatServer.class.getName());
	private static Random rand = new Random(10);

	public static void main(String[] args) {

		final String HeartPort = "50051";
		HeartBeatServer Heartserver = new HeartBeatServer();

		// Properties prop = mathserver.getProperties();

		Heartserver.registerService("_grpc._tcp.local.", "hearbeat", HeartPort, "heartbeat");

		int port1 = Integer.valueOf(HeartPort);// #.50051;

		try {

			Server server = ServerBuilder.forPort(port1).addService(Heartserver).build().start();

			System.out.println("HeartBeat Server started, listening on " + port1);

			server.awaitTermination();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		HeartBeatServer HeartBeatserver = new HeartBeatServer();

		int port = 50056;
		String service_type = "_grpc._tcp.local.";
		String service_name = "HeartBeat Server";
		ServiceRegistration ssr = new ServiceRegistration();
		ssr.run(port, service_type, service_name);

		try {
			Server server = ServerBuilder.forPort(port).addService(HeartBeatserver).build().start();
			System.out.println("\nServer HeartBeat Started");

			server.awaitTermination();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		logger.info("Server started, listening on " + port1);
	}

	public void registerService(String serviceType, String serviceName, String port, String serviceDesc) {

		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

			String service_type = serviceType;// "_http._tcp.local.";
			String service_name = serviceName;// "example";
			// int service_port = 1234;
			int service_port = Integer.valueOf(port);// #.50051;

			String service_description_properties = serviceDesc;// "path=index.html";

			// Register a service
			ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port,
					service_description_properties);
			jmdns.registerService(serviceInfo);

			System.out.printf("registrering service with type %s and name %s \n", service_type, service_name);

			// Wait a bit
			Thread.sleep(1000);

			// Unregister all services
			// jmdns.unregisterAllServices();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private int generateHeartRate(Patient patient) {

		int min = 40;
		int max = 200;
		switch (patient.getRiskLevel()) {
		case 1:
			min = 30;
			max = 210;
			break;
		case 2:
			min = 40;
			max = 200;
			break;
		case 3:
			min = 50;
			max = 190;
			break;
		case 4:
			min = 60;
			max = 180;
			break;
		default:
		}
		return rand.nextInt(max - min) + min + 1;
	}

	public void getRate(HeartbeatRequest request, StreamObserver<HeartbeatResponse> responseObserver) {
		System.out.printf("receiving generated heartbeats \n", request.getPatientId());

		int id = request.getPatientId();
		Patient patient = Patient.getPatient(id);
		int bpm = this.generateHeartRate(patient);

		HeartbeatResponse result = HeartbeatResponse.newBuilder().setBpm(bpm).build();

		try {
			// wait for a second
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		patient.setBpm(bpm);
		responseObserver.onNext(result);

		responseObserver.onCompleted();
	}
}
