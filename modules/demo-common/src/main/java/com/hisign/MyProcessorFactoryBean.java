package com.hisign;

import java.lang.reflect.Constructor;

import org.apache.thrift.TProcessor;
import org.springframework.beans.factory.FactoryBean;

public class MyProcessorFactoryBean implements FactoryBean<TProcessor> {
	
	/**
	 * 实现类对象
	 */
	private Object serviceImplObject;
	
	/**
	 * 实现类接口
	 */
	private String serviceInterface;

	@Override
	public TProcessor getObject() throws Exception {
		// TODO Auto-generated method stub
		Class<?> processorClass = Class.forName(this.serviceInterface + "$Processor");
		Class<?> ifaceClass = Class.forName(this.serviceInterface + "$Iface");
		Constructor<?> con = processorClass.getConstructor(ifaceClass);
        TProcessor processor = (TProcessor) con.newInstance(serviceImplObject);  
		
		return processor;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return TProcessor.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

	public Object getServiceImplObject() {
		return serviceImplObject;
	}

	public void setServiceImplObject(Object serviceImplObject) {
		this.serviceImplObject = serviceImplObject;
	}

	public String getServiceInterface() {
		return serviceInterface;
	}

	public void setServiceInterface(String serviceInterface) {
		this.serviceInterface = serviceInterface;
	}
}
