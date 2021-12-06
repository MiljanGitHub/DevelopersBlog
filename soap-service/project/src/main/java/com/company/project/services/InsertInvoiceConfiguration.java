package com.company.project.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class InsertInvoiceConfiguration {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.company.project.stubs");
		return marshaller;
	}
	
	@Bean
	public InsertInvoiceClient insertInvoiceClient(Jaxb2Marshaller marshaller) {
		InsertInvoiceClient client = new InsertInvoiceClient();
		client.setDefaultUri(""); 
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
