package com.hisign;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.THttpClient;

public class HelloTest {
	/**
	 * @param args 
	 */
	public static void main(String[] args) {

	 String serveltUrl = "http://127.0.0.1:8070/demo/helloService";

	 try {   

		 THttpClient thc = new THttpClient(serveltUrl);
	
		 TProtocol lopFactory = new TBinaryProtocol(thc);  
	
		 HelloWorldService.Client client = new HelloWorldService.Client(
				 lopFactory);  
	
		String result = client.sayHello("hhhhh");
		System.out.println("Thrify client result =: " + result);  

	 } catch (TException ex) {


	 }  
 }  

	
}
