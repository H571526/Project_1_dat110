package no.hvl.dat110.messaging;

import java.io.IOException;
import java.net.Socket;

public class MessagingClient {

	private String server;
	private int port;

	public MessagingClient(String server, int port) {
		this.server = server;
		this.port = port;
	}

	// connect to messaging server
	public Connection connect() {

		Socket clientSocket = null;
		Connection connection = null;

		// TODO
		
		try {
			
			 clientSocket = new Socket(server, port); 
	         connection = new Connection(clientSocket);
			
		}
		catch (IOException ex) {
			ex.printStackTrace();
			
		}

		return connection;
	}
}
