package com.sps.dependent;

import org.springframework.stereotype.Component;

@Component("nts")
public class NatrazSir implements Teacher {

	@Override
	public void getFacultyStatus() {
		System.out.println("Hello I am Natraz teaching for SpringBoot MicroServices.");
	}
}
