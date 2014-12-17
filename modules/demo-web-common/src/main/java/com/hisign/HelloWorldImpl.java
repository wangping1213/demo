package com.hisign;

import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

/**
 * blog http://www.micmiu.com
 *
 * @author Michael
 *
 */
@Service("helloWorld")
public class HelloWorldImpl implements HelloWorldService.Iface {


	@Override
	public String sayHello(String username) throws TException {
		return "Hi," + username + "搞活经济； welcome to my blog www.micmiu.com撒点粉";
	}

}