package com.company.project.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.company.project.stubs");
		return marshaller;
	}

	@Bean
	public HelloWorldClient helloWorldClient(Jaxb2Marshaller marshaller) {
		HelloWorldClient client = new HelloWorldClient();
		client.setDefaultUri(""); 
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
