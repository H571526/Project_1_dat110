package no.hvl.dat110.messaging;

import static no.hvl.dat110.messaging.MessageConfig.SEGMENTSIZE;

public class Message {

	private byte[] payload;

	public Message(byte[] payload) {
		if(payload.length <= SEGMENTSIZE) {
			this.payload = payload;
		} else {
			System.out.println("Message too long");
		}
	}

	public Message() {
		super();
	}

	public byte[] getData() {
		return this.payload; 
	}

	public byte[] encapsulate() {
		
		byte[] encoded = new byte[SEGMENTSIZE];
		encoded[0] = (byte) payload.length;
		
		
		for(int i = 0; i < payload.length; i++) {
			encoded[i+1] = payload[i];
		}
		
			
		
		return encoded;
		
	}

	public void decapsulate(byte[] received) {
		int n =(int) received[0];
		
		
		payload = new byte[n];
		
		for (int i = 0; i< n; i++) {
			payload[i] = received[i+1];
		}
	   
		
		
	}
}
