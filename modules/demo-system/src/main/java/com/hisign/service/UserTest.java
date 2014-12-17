package com.hisign.service;

import java.util.List;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.THttpClient;

import com.hisign.model.SysUser;
import com.hisign.model.UserFilter;

public class UserTest {
	/**
	 * @param args 
	 */
	public static void main(String[] args) {

	 String serveltUrl = "http://127.0.0.1:8070/demo/userService";

	 try {   

		 THttpClient thc = new THttpClient(serveltUrl);
	
		 TProtocol lopFactory = new TBinaryProtocol(thc);
	
		 UserService.Client client = new UserService.Client(
				 lopFactory);
//		SysUser user = client.findSysUserById("R09AF69935AA00D8E0430A2833CF0032");
		UserFilter filter = new UserFilter();
		//filter.setUserLevel("2");
//		List<String> ids = new ArrayList<String>();
//		for (int i=0; i<5000; i++) {
//			ids.add("1");
//		}
//		filter.setIds(ids);
		filter.setCreateDatetime("2014-1-22 17:51:38");
//		filter.setUsername("ee");
		filter.setUserLevel("2");
		filter.setStartNum(0);
		filter.setEndNum(10000);
		int count = client.findSysUserListByFilterForCount(filter);
		System.out.println(count);
		List<SysUser> list = client.findSysUserListByFilter(filter);
		System.out.println("Thrify client result =: " + list);

	 } catch (TException ex) {
		 ex.printStackTrace();
	 }  
 }  

	
}
