package userLogin;

import java.io.IOException;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.logging.Logger;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import userLogin.UserServiceGrpc.UserServiceImplBase;


public class LoginServer extends UserServiceImplBase {
	
	private static final Logger logger = Logger.getLogger(LoginServer.class.getName());
	private HashSet<String> logedinUsers = new HashSet<String>();
	
	public static void main(String[] args) {
		
		LoginServer userServer = new LoginServer();
		
		int port = 50011;
	    
		try {
			Server server = ((ServerBuilder) ServerBuilder.forPort(port))
			.addService(userServer)
			    .build()
			    .start();
			System.out.println("Login server Started");
			
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
	
	
	@Override
	public void login(LoginRequest request,  StreamObserver<LoginResponse> responseObserver) {
		  
		System.out.println("receiving login request");
		
		
		if (this.logedinUsers.contains(request.getUsername())) {
			// reply with already logged 
		}
		this.logedinUsers.add(request.getUsername());
		
		
		LoginResponse reply = LoginResponse.newBuilder().setResponseMessage("Hi out there again " + request.getUsername()).build();
	     
		 responseObserver.onNext(reply);
	     
	     responseObserver.onCompleted();
	
	}
	
	@Override
	public void logout(LogoutRequest request,  StreamObserver<LogoutResponse> responseObserver) {
		    
		System.out.println("receiving login request");
		
		 LogoutResponse reply = LogoutResponse.newBuilder().setResponseMessage("you have signed out " + request.getUsername()).build();
	     
		 responseObserver.onNext(reply);
	     
	     responseObserver.onCompleted();
	
	}
}
	