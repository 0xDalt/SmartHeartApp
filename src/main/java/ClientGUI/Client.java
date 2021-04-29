package ClientGUI;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.jmdns.ServiceInfo;

import HeartBeat.HeartBeatGrpc;
import HeartBeat.HeartBeatGrpc.HeartBeatBlockingStub;
import HeartBeat.HeartbeatRequest;
import HeartBeat.HeartbeatResponse;
import MyJmdns.ServiceDiscovery;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import userLogin.UserServiceGrpc;
import userLogin.UserServiceGrpc.UserServiceBlockingStub;

public class Client {

	private static final Logger logger = Logger.getLogger(Client.class.getName());

	private static HeartBeatBlockingStub blockingStub;
		  
	public static void main(String[] args) throws Exception {
		
		ServiceInfo serviceInfo;
		String service_type = "_grpc._tcp.local.";
		serviceInfo = ServiceDiscovery.run(service_type);
		int port = serviceInfo.getPort();
		String host = "localhost";
		//int port = 50050;
		
		ManagedChannel channel = ManagedChannelBuilder.
				forAddress(host, port)
				.usePlaintext()
				.build();
		
		blockingStub = HeartBeatGrpc.newBlockingStub(channel);
				
		
	    
		int bpm=generateHeartBeat();
		
	   
		//Now create second Channel
	    Thread.sleep(20000); //Sleep here is purely to pause the printout to the console
		
		ServiceInfo serviceInfo2;
		String service_type2 = "_grpc2._tcp.local.";
		serviceInfo2 = ServiceDiscovery.run(service_type2);
		int port2 = serviceInfo2.getPort();
		String host2 = "localhost";
		//int port = 50054;
		
		ManagedChannel channel2 = ManagedChannelBuilder.
				forAddress(host2, port2)
				.usePlaintext()
				.build();
		
		UserServiceBlockingStub  blockingStub2 = UserServiceGrpc.newBlockingStub(channel2);
		//patient(bpm);
		
		
	    
	    try {
	    	 
	    	 
	    } catch (StatusRuntimeException e) {
		    logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		    
		    return;		
		    
	    } finally {
	    	//shutdown channel
	    	channel2.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	    }
	    
	    Thread.sleep(20000);
	    ServiceInfo serviceInfo3;
		String service_type3 = "_grpc2._tcp.local.";
		serviceInfo3 = ServiceDiscovery.run(service_type2);
		int port3 = serviceInfo2.getPort();
		String host3 = "localhost";
		//int port = 50055;
		
		ManagedChannel channel3 = ManagedChannelBuilder.
				forAddress(host3, port3)
				.usePlaintext()
				.build();
		
		UserServiceBlockingStub  blockingStub3 = UserServiceGrpc.newBlockingStub(channel3);
		
	    
	    try {
	    	 
	    	 
	    } catch (StatusRuntimeException e) {
		    logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		    
		    return;		
		    
	    } finally {
	    	//shutdown channel
	    	channel2.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	    }
	    //add in HeartBeat info.
	    
	    
	}
	public static int generateHeartBeat() {
		HeartbeatRequest request = HeartbeatRequest.newBuilder()
				.setCurrentRate(50).setMin(50).setMax(130).build();
		HeartbeatResponse temp;
		try {
			Iterator<HeartbeatResponse> responces = blockingStub.getRate());

			while(responces.hasNext()){
				 temp = responces.next();
				System.out.println(temp.getBpm());				
			}

		} catch (StatusRuntimeException e) {
			e.printStackTrace();
		}
		return temp.getBpm();
	}
}
