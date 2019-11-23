package edu.neu.csye6200.daycare.controller;

import edu.neu.csye6200.daycare.factory.*;
import edu.neu.csye6200.daycare.objects.*;
import edu.neu.csye6200.daycare.util.FileUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

import org.omg.CORBA.DynAnyPackage.InvalidValue;

public class DayCareController {
	private static final String studentFileName = "student.csv";
	private static final String teacherFileName = "teacher.csv";
	private static SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	private static FileUtil fileutil = new FileUtil();
	private DayCare dayCareObj = null;
	private DayCareFactory  dayCarefactoryObj =  null;
	public DayCare getDayCareObj() {
		return dayCareObj;
	}



	public void setDayCareObj(DayCare dayCareObj) {
		this.dayCareObj = dayCareObj;
	}



	public DayCareFactory getDayCarefactoryObj() {
		return dayCarefactoryObj;
	}



	public void setDayCarefactoryObj(DayCareFactory dayCarefactoryObj) {
		this.dayCarefactoryObj = dayCarefactoryObj;
	}



	public EnrollmentRulesFactory getEnrollmentFactoryObj() {
		return enrollmentFactoryObj;
	}



	public void setEnrollmentFactoryObj(EnrollmentRulesFactory enrollmentFactoryObj) {
		this.enrollmentFactoryObj = enrollmentFactoryObj;
	}



	public StudentFactory getStudentFactoryObj() {
		return studentFactoryObj;
	}



	public void setStudentFactoryObj(StudentFactory studentFactoryObj) {
		this.studentFactoryObj = studentFactoryObj;
	}



	public TeacherFactory getTeacherFactoryObj() {
		return teacherFactoryObj;
	}



	public void setTeacherFactoryObj(TeacherFactory teacherFactoryObj) {
		this.teacherFactoryObj = teacherFactoryObj;
	}



	private EnrollmentRulesFactory enrollmentFactoryObj = null;
	private StudentFactory  studentFactoryObj = null;
	private TeacherFactory  teacherFactoryObj = null;
	
	
	

	public static String getDateformat() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate localDate = LocalDate.now();
		String date = DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate);
		return date;
	}
		

	
	public void addSixMonths() {
		
	}


	
	public static void demo(DayCareController dc) throws Exception {
		System.out.println("DayCare Demo ");
		
		//Get DayCare factory obj from DayCare factory
		DayCareFactory  factoryObj = DayCareFactory.getObj();
		dc.setDayCarefactoryObj(factoryObj);
		System.out.println("DayCare Factory obj created");

		 //Get DayCare obj 
		DayCare DayCare = factoryObj.getDayCareObj();
		dc.setDayCareObj(DayCare);
		System.out.println("DayCare obj  created");

		
		//Creating Rules
		EnrollmentRulesFactory enrollFactoryObj = EnrollmentRulesFactory.getObj();
		dc.setEnrollmentFactoryObj(enrollFactoryObj);
		System.out.println("Rules factory obj  created");
		List<String> enrollmentRegulationList = new ArrayList<String>();
		//minAge, maxAge, num of Students, num of Teachers, groupSize 
		enrollmentRegulationList.add("6,12,4,1,3");
		enrollmentRegulationList.add("13,24,2,1,2");	//values changed for testing purpose only
		enrollmentRegulationList.add("25,35,6,1,3");
		enrollmentRegulationList.add("36,47,8,1,3");
		enrollmentRegulationList.add("48,59,12,1,2");
		enrollmentRegulationList.add("60,100,15,1,2");
		dc.getDayCareObj().setEnrollmentruleList(enrollFactoryObj.getRuleObj(enrollmentRegulationList));
		
		for (EnrollmentRules EnrollmentRules : dc.getDayCareObj().getEnrollmentruleList()) {
			EnrollmentRules.showRuleDetails();
		}
		System.out.println("Rule objs created");

		//*****INITIALIZATION START*****
		//Get Student factory obj from Student factory
		StudentFactory  studentFactoryObj = StudentFactory.getObj();
		dc.setStudentFactoryObj(studentFactoryObj);
		System.out.println("Student Factory obj");
		
		//Get Teacher factory obj from Student factory
		TeacherFactory  teacherFactoryObj = TeacherFactory.getTeacherFactoryObj();
		dc.setTeacherFactoryObj(teacherFactoryObj);
		System.out.println("Teacher Factory obj");
		
		//Store data read from file in file_data, call readTextFile using FileUtil object passing filename
		List<String> teacher_data = fileutil.readTextFile(teacherFileName);
		System.out.println("Teacher File read successfully");
		dc.getDayCareObj().setTeacherList(teacherFactoryObj.getTeacherObj(teacher_data));
		
		//Store data read from file in file_data, call readTextFile using FileUtil object passing filename
		List<String> student_data = fileutil.readTextFile(studentFileName);
		System.out.println("Student File read successfully");
		List<Student> studentList = studentFactoryObj.initStudentObj(student_data);
		dc.getDayCareObj().enrollStudent(studentList);

		//*****INITIALIZATION COMPLETE*****
		System.out.println("INITIALIZATION COMPLETE");
		System.out.println("DayCare Demo Done");
		
		for (Classroom classroom : dc.getDayCareObj().getClassroomList()) {
			System.out.print("\nClassID:"+classroom.getClassroomID()+"\tAge group:"+classroom.getEnrollmentRule().getMinAge()+"-"+classroom.getEnrollmentRule().getMaxAge()+"months");
			for (Group group : classroom.getGroupList()) {
				System.out.print("\n\tGroupID:"+group.getGroupID()+"   Teacher Assigned:"+group.getTeacher().getFirstName()+"\n");
				for (Student student : group.getStudentList()) {
					System.out.println("StudentID:"+student.getStudentID()+"\t Age:"+student.getAge()+"months");
				}
			}
		}
	}
	
	

}
