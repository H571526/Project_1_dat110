package no.hvl.dat110.system.controller;

import no.hvl.dat110.rpc.*;

public class Sensor extends RPCStub {

	private byte RPCID = 1;
	
	public int read() {
		
		int temp;

		byte[] bytes = rmiclient.call(RPCUtils.marshallVoid(RPCID));

		temp = RPCUtils.unmarshallInteger(bytes);

		return temp;
	}
	
}
