package com.sps.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sps.dependent.Teacher;

@Component("hydIn")
public class HyderabadInstiuite {

	@Autowired
	@Qualifier("teacherObj")
	Teacher ts;

	public void callingMethod() {
		ts.getFacultyStatus();
	}
}
