package org.sarm.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.sarm.rest.modal.Student;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/students")
public class StudentRestController {

	@RequestMapping(value = "/get-all-students")
	public @ResponseBody List<Student> getAllStudents() {

		List<Student> list = new ArrayList<Student>();

		Student st = new Student();
		st.setDescription("This is 1st student get from DB");
		st.setStudentId(1001L);
		st.setName("Jay");
		list.add(st);

		Student st2 = new Student();
		st2.setDescription("This is 2nd student get from DB also");
		st2.setStudentId(1001);
		st2.setName("vijay");
		list.add(st2);

		return list;
	}

	@RequestMapping(value = "/getstudentinfo/{studentId}")
	public @ResponseBody Student getStudent(
			@PathVariable("studentId") Long studentId) {
		Student st = new Student();
		st.setDescription("Some thing must get from DB with studentId is "
				+ studentId);
		st.setStudentId(studentId);
		st.setName("Student name");
		return st;
	}

	@RequestMapping(value = "/add-student", method = RequestMethod.POST, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody Student addProduct(@RequestBody Student st) {

		System.out.println("pr" + st);
		return st;
	}
}
