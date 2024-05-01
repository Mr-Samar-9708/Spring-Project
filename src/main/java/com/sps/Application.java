package com.sps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.sps.comp.HyderabadInstiuite;

@SpringBootApplication
@ImportResource("com/sps/cfg/application.xml")
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		HyderabadInstiuite hyd = ctx.getBean("hydIn", HyderabadInstiuite.class);
		hyd.callingMethod();
	}
}
