package manytomany.controller;

import java.util.ArrayList;
import java.util.List;

import manytomany.dao.Coursedao;
import manytomany.dao.Studentdao;
import manytomany.dto.Course;
import manytomany.dto.Student;

public class StudentCourse {

	public static void main(String[] args) {

//		Course course1 = new Course();
//		course1.setId(1);
//		course1.setName("Java");
//		course1.setFees(5000);
//
//		Course course2 = new Course();
//		course2.setId(2);
//		course2.setName("Python");
//		course2.setFees(50000);
//
//		Course course3 = new Course();
//		course3.setId(3);
//		course3.setName("JS");
//		course3.setFees(500000);
//
//		Student student1 = new Student();
//		student1.setId(1);
//		student1.setName("Nikhil");
//		student1.setAddress("Pune");
//
//		List<Course> courses = new ArrayList<Course>();
//		courses.add(course1);
//		courses.add(course2);
//		courses.add(course3);
//
//		student1.setCourse(courses);
//
//		Student student2 = new Student();
//		student2.setId(2);
//		student2.setName("Rohan");
//		student2.setAddress("Nagar");

		// student2.setCourse(courses); can set sqme or different list also

//		List<Course> courses1 = new ArrayList<Course>();
//		courses1.add(course1);
//		courses1.add(course2);
//		courses1.add(course3);
//
//		student2.setCourse(courses1);
//
//		Coursedao coursedao = new Coursedao();
//		coursedao.savecourse(course1);
//		coursedao.savecourse(course2);
//		coursedao.savecourse(course3);
//
//		Studentdao studentdao = new Studentdao();
//		studentdao.savestudent(student1);
//		studentdao.savestudent(student2);

		// find course and student

//		Studentdao studentdao = new Studentdao();
//		studentdao.findstudent(1);
//
//		Coursedao coursedao = new Coursedao();
//		coursedao.findcourse(1);

		// find all courses

		Coursedao coursedao = new Coursedao();
		coursedao.findAllCourses();

	}

}
