package com.company.project.services;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.company.project.stubs.HelloWorld;
import com.company.project.stubs.HelloWorldResponse;
import com.company.project.stubs.ObjectFactory;

@Service
public class HelloWorldClient extends WebServiceGatewaySupport {
	
	@Autowired
	private ObjectFactory objectFactory;
	
	@Value("${arvato.soap.address}")
	private String soapAddress;

	public HelloWorldResponse getValue(String myValue) {

		HelloWorld request = objectFactory.createHelloWorld();
		JAXBElement<String> value = objectFactory.createHelloWorldMyValue(myValue);
		request.setMyValue(value);

		HelloWorldResponse response = (HelloWorldResponse) getWebServiceTemplate()
				.marshalSendAndReceive(soapAddress, 
						request, new SoapActionCallback("http://tempuri.org/IAFSService/HelloWorld"));

		return response;
	}

}