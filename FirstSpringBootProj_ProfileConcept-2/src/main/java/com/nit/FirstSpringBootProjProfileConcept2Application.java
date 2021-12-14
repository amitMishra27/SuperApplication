package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.Controller.commonControllerImpl;

@SpringBootApplication
public class FirstSpringBootProjProfileConcept2Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(FirstSpringBootProjProfileConcept2Application.class, args);
		commonControllerImpl ct=ctx.getBean("cntrl", commonControllerImpl.class);
		System.out.println(ct.getResults());
		
	}

}
