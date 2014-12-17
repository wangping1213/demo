package com.hisign;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 * blog http://www.micmiu.com
 *
 * @author Michael
 *
 */
public class HelloClientDemo_TThreadedSelectorServer {

	public static final String SERVER_IP = "localhost";
	public static final int SERVER_PORT = 8090;
	public static final int TIMEOUT = 30000;

	/**
	 *
	 * @param userName
	 */
	public void startClient(String userName) {
		TTransport transport = null;
		
		try {
//			TAsyncClientManager clientManager = new TAsyncClientManager();
//			transport = new TNonblockingSocket(SERVER_IP, SERVER_PORT, TIMEOUT);
//			// 协议要和服务端一致
//			TProtocolFactory protocol = new TBinaryProtocol.Factory();
//			// TProtocol protocol = new TCompactProtocol(transport);
//			// TProtocol protocol = new TJSONProtocol(transport);
//			HelloWorldService.AsyncClient client = new HelloWorldService.AsyncClient(
//					protocol, clientManager, transport);
//			transport.startConnect();
//			MethodCallback callback = new MethodCallback();
//			client.sayHello(userName, callback);
//			
//			Object result = callback.getResult();
//			while (null == result) {
//				result = callback.getResult();
//			}

//			transport = new TNonblockingSocket(SERVER_IP, SERVER_PORT, TIMEOUT);
			
			transport = new TFramedTransport(new TSocket(SERVER_IP, SERVER_PORT, TIMEOUT));
			// 协议要和服务端一致
			TProtocol protocol = new TBinaryProtocol(transport);
			// TProtocol protocol = new TCompactProtocol(transport);
			// TProtocol protocol = new TJSONProtocol(transport);
			HelloWorldService.Client client = new HelloWorldService.Client(
					protocol);
			transport.open();
			String result = client.sayHello(userName);
			
			
			System.out.println("Thrify client result =: " + result);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != transport) {
				transport.close();
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloClientDemo_TThreadedSelectorServer client = new HelloClientDemo_TThreadedSelectorServer();
		client.startClient("Michael");

	}

}