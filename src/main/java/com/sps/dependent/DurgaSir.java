package com.sps.dependent;

import org.springframework.stereotype.Component;

@Component("ds")
public class DurgaSir implements Teacher{

	@Override
	public void getFacultyStatus() {
		System.out.println("Hello I am Durga Sir teaching for Core-Java.");
	}
}
