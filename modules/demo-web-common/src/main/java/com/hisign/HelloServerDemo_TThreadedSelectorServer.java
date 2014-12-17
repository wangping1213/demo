package com.hisign;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadedSelectorServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TNonblockingServerTransport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * blog http://www.micmiu.com
 *
 * @author Michael
 *
 */
public class HelloServerDemo_TThreadedSelectorServer {
	public static final int SERVER_PORT = 8090;
	private TProcessor tprocessor;

	public void startServer() {
		try {
			System.out.println("HelloWorld TThreadedSelectorServer start ....");

			TProcessor tprocessor = new HelloWorldService.Processor<HelloWorldService.Iface>(new HelloWorldImpl());

			TNonblockingServerTransport serverTransport = new TNonblockingServerSocket(SERVER_PORT);
			TServer server = new TThreadedSelectorServer(
						 new TThreadedSelectorServer.Args(serverTransport)
				 		 .processor(tprocessor)
				 		 .transportFactory(new TFramedTransport.Factory())
						 .protocolFactory(new TBinaryProtocol.Factory())
					 );
			 server.serve();

		} catch (Exception e) {
			System.out.println("Server start error!!!");
			e.printStackTrace();
		}
	}

	public TProcessor getTprocessor() {
		return tprocessor;
	}

	public void setTprocessor(TProcessor tprocessor) {
		this.tprocessor = tprocessor;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloServerDemo_TThreadedSelectorServer server = new HelloServerDemo_TThreadedSelectorServer();
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-service-thrift.xml");  
		server.setTprocessor((TProcessor) context.getBean("helloProcessor")); 
		System.out.println(context);
		
		server.startServer();
		
	}

}