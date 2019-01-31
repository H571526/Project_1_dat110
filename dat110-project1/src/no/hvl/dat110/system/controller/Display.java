package no.hvl.dat110.system.controller;

import no.hvl.dat110.rpc.*;

public class Display extends RPCStub {

	private byte RPCID = 1;

	public void write(String message) {

		byte[] bytes = RPCUtils.marshallString(RPCID, message);

		rmiclient.call(bytes);
	}
}
