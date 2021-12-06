package com.company.project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.company.project.stubs.AFSUser;
import com.company.project.stubs.ObjectFactory;



@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}
	
	@Bean
	public ObjectFactory getObjectFactory() {
		return new ObjectFactory();
	}
	

	@Bean
    public AFSUser getAFSUser(@Value("${arvato.username}") String username, @Value("${arvato.password}") String password, @Value("${arvato.clientId}") int clientId) {

		AFSUser user = new AFSUser();
		
		user.setClientID(clientId);
		user.setPassword(password);
		user.setUsername(username);
		
		return user; 
    }
	

}
