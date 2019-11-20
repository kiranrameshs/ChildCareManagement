package edu.neu.csye6200.daycare;

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
	private List<Classroom> classroomList = new ArrayList<Classroom>();
	private List<EnrollmentRules> enrollmentruleList = null;
	private static SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	private List<Teacher> teacherList = new ArrayList<Teacher>();
	
	
	public static String getDateformat() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate localDate = LocalDate.now();
		String date = DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate);
		return date;
	}
	
	public void addClassroom(Classroom classroom) {
		this.classroomList.add(classroom);
	}
	
	public void removeClassroom(Classroom classroom) {
		
	}
	
	public List<Teacher> getTeacherList() {
		return this.teacherList;
	}

	public void setTeacherList(List<Teacher> teacherList) {
		this.teacherList = teacherList;
	}

	public void addClassroomID(int classroomID) {
		
	}
	
	public void removeClassroomID(Classroom classroomID) {
		
	}

	public void showDayCareDetails() {
		this.toString();
	}
	
	public void showTeacherListDetails() {
		for (Teacher teacher : this.teacherList) {
			System.out.println("teacher ID "+teacher.getTeacherID()+" teacher availability "+teacher.getisAvailable());
			if (teacher.getisAvailable()) {
				System.out.println("teacher is available to be assigned to a group");
			}
		}
	}
	
	public Classroom setClassIDGroupID(Student student, EnrollmentRules rule) throws Exception {
		boolean classroomFound = false;
		boolean groupFound = false;
		boolean teacherFound = false;
		Classroom vacantClassroom = null;
		if (this.classroomList.isEmpty()) {
			Classroom classObj = new Classroom(this.classroomList.size(), rule);
			classroomFound = true;
			this.addClassroom(classObj);
			System.out.println("No classrooms available, new class created");
			Group groupObj = new Group(classObj.getNumOfGroups(), classObj.getEnrollmentRule());
			groupObj.setClassID(classObj.getClassroomID());
			System.out.println("No groups available, new group created");
			classObj.addGroupObj(groupObj);
			//add teacher
			for (Teacher teacher : teacherList) {
				if (teacher.getisAvailable()) {
					teacher.setAvailable(false);
					teacher.setClassID(classObj.getClassroomID());
					teacher.setGroupID(groupObj.getGroupID());
					groupObj.setTeacher(teacher);
					teacherFound = true;
					break;
				}
			}
			
			if (groupObj.getGroupSize()+1 <= groupObj.getEnrollmentRule().getGroupSize()) {
				groupFound = true;
				groupObj.addStudent(student);
				student.setGroupID(groupObj.getGroupID());
				System.out.println("groupID set");
				student.setClassID(classObj.getClassroomID());
				System.out.println("classID set");
				return classObj;
			}
		}
		else {
			for (Classroom classroom : this.classroomList) {
				if (classroom.getEnrollmentRule().equals(rule)) {
					if(classroom.getNumOfGroups()<=classroom.getEnrollmentRule().getMaxGroup()) {
						if(classroom.getNumOfGroups()==classroom.getEnrollmentRule().getMaxGroup()) {
							System.out.println("Classroom is full");
						}
						else {
							classroomFound = true;
							vacantClassroom = classroom;
							for (Group group : classroom.getGroupList()) {
								if (group.getGroupSize()+1 <= group.getEnrollmentRule().getGroupSize()) {
									System.out.println("Group with vacancy found");
									groupFound = true;
									group.addStudent(student);
									student.setGroupID(group.getGroupID());
									System.out.println("groupID set");
									student.setClassID(classroom.getClassroomID());
									System.out.println("classID set");
									return classroom;
								}
								else{
										System.out.println("Group is full");
									}
							}
						}	
						}
					else{
						System.out.println("Classroom is full");
						}
				}
				else {
					System.out.println("Class rule mismatch");
				}
				if (classroomFound == true && vacantClassroom != null) {
					System.out.println("Vacant classroom available, group is full, creating new group");
					System.out.println("inputs for creating new group are "+vacantClassroom.getNumOfGroups()+"  "+ vacantClassroom.getEnrollmentRule());
					Group newGroup = new Group(vacantClassroom.getNumOfGroups(), vacantClassroom.getEnrollmentRule());
					newGroup.setClassID(vacantClassroom.getClassroomID());
					vacantClassroom.addGroupObj(newGroup);
					//add teacher
					for (Teacher teacher : teacherList) {
						if (teacher.getisAvailable()) {
							teacher.setAvailable(false);
							teacher.setClassID(newGroup.getClassID());
							teacher.setGroupID(newGroup.getGroupID());
							newGroup.setTeacher(teacher);
							teacherFound = true;
							break;
						}
					}
					System.out.println("check ***  "+newGroup.getGroupID()+"  "+(newGroup.getGroupSize()+1)+"   "+newGroup.getEnrollmentRule().getGroupSize());
					if (newGroup.getGroupSize()+1 <= newGroup.getEnrollmentRule().getGroupSize()) {
						groupFound = true;
						newGroup.addStudent(student);
						student.setGroupID(newGroup.getGroupID());
						System.out.println("groupID set");
						student.setClassID(vacantClassroom.getClassroomID());
						System.out.println("classID set");
						return vacantClassroom;
				}
			}
		}
		}
		System.out.println("classroomFound is "+classroomFound +"  groupFound  "+groupFound);
		if (classroomFound == false && groupFound == false) {
			System.out.println("Class and group not found");
			System.out.println("Creating new class and group");
			Classroom classObj = new Classroom(this.classroomList.size(), rule);
			classroomFound = true;
			Group groupObj = new Group(classObj.getNumOfGroups(), classObj.getEnrollmentRule());
			groupObj.setClassID(classObj.getClassroomID());
			classObj.addGroupObj(groupObj);
			//add teacher
			for (Teacher teacher : teacherList) {
				if (teacher.getisAvailable()) {
					teacher.setAvailable(false);
					teacher.setClassID(groupObj.getClassID());
					teacher.setGroupID(groupObj.getGroupID());
					groupObj.setTeacher(teacher);
					teacherFound = true;
					break;
				}
			}
			if (groupObj.getGroupSize()+1 <= groupObj.getEnrollmentRule().getGroupSize()) {
				groupFound = true;
				groupObj.addStudent(student);
				student.setGroupID(groupObj.getGroupID());
				System.out.println("groupID set");
				student.setClassID(classObj.getClassroomID());
				System.out.println("classID set");
				return classObj;
			}
			
		}
		throw new Exception("Invalid input while assigning Class ID");
		}
	
	public EnrollmentRules getApplicableEnrollmentRule(int age) throws InvalidValue {
		for (EnrollmentRules enrollmentRules : this.enrollmentruleList) {
			if((enrollmentRules.getMinAge()<= age && age <= enrollmentRules.getMaxAge())) {
				System.out.println("Rule found");
				return enrollmentRules;
			}
			else {
				System.out.println("Age group mismatch");	
			}
		}
		throw new InvalidValue("Invalid Age input for Student"); 
	}
	
	public void enrollStudent(Student student) throws Exception {
			int studentAge = student.getAge();
			EnrollmentRules rule = this.getApplicableEnrollmentRule(studentAge);
			System.out.println("Applicable rule is "+rule.getAgeRange());
			this.setClassIDGroupID(student, rule);
			System.out.println("Student Enrollemnt Complete");
			student.showStudentDetails();
			System.out.println("Student Enrollemnt Complete\n");
		}

	
	public static void demo() throws Exception {
		System.out.println("DayCare Demo ");
		
		
		//Get DayCare factory obj from DayCare factory
		DayCareFactory  factoryObj = DayCareFactory.getObj();
		System.out.println("DayCare Factory obj created");

		DayCareController DayCare = factoryObj.getDayCareObj();
		System.out.println("DayCare obj  created");
		
		//Creating Rules
		EnrollmentRulesFactory enrollFactoryObj = EnrollmentRulesFactory.getObj();
		System.out.println("Rules factory obj  created");
		
		
		List<String> enrollmentRegulationList = new ArrayList<String>();
		//minAge, maxAge, num of Students, num of Teachers, groupSize 
		enrollmentRegulationList.add("6,12,4,1,3");
		enrollmentRegulationList.add("13,24,2,1,2");	//values changed for testing purpose only
		enrollmentRegulationList.add("25,35,6,1,3");
		enrollmentRegulationList.add("36,47,8,1,3");
		enrollmentRegulationList.add("48,59,12,1,2");
		enrollmentRegulationList.add("60,100,15,1,2");
		DayCare.enrollmentruleList = enrollFactoryObj.getRuleObj(enrollmentRegulationList);
		for (EnrollmentRules EnrollmentRules : DayCare.enrollmentruleList) {
			EnrollmentRules.showRuleDetails();
		}
		System.out.println("Rule objs created");

		//*****INITIALIZATION START*****
		//Get Student factory obj from Student factory
		StudentFactory  studentFactoryObj = StudentFactory.getObj();
		System.out.println("Student Factory obj");
		
		//Get Teacher factory obj from Student factory
		TeacherFactory  teacherFactoryObj = TeacherFactory.getTeacherFactoryObj();
		System.out.println("Teacher Factory obj");
		
		//enrollment begins here for multiple entries (initialization -> push to static)
		FileUtil fileutil = new FileUtil();
		
		//Store data read from file in file_data, call readTextFile using FileUtil object passing filename
		List<String> teacher_data = fileutil.readTextFile(teacherFileName);
		System.out.println("Teacher File read successfully");
		DayCare.setTeacherList(teacherFactoryObj.getTeacherObj(teacher_data));
		
		//Store data read from file in file_data, call readTextFile using FileUtil object passing filename
		List<String> student_data = fileutil.readTextFile(studentFileName);
		System.out.println("Student File read successfully");
		List<Student> studentList = studentFactoryObj.initStudentObj(student_data);
			for (Student student : studentList) {
					DayCare.enrollStudent(student);
			}
		//*****INITIALIZATION COMPLETE*****
		System.out.println("INITIALIZATION COMPLETE");
		
		
		//enrollment begins here for single entry for inputs from UI
//		String sampleStudentData = "Bilz, Tompson,20, #60 St Germain, Aron Tompson, Emma Tompson,8888888888,"+formatter.format(new Date());
//		Student student  = studentFactoryObj.getStudentObj(sampleStudentData);
//		System.out.println("Student obj created");
//		DayCare.enrollStudent(student);
		
		for (Classroom classroom : DayCare.classroomList) {
			System.out.print("\nClassID:"+classroom.getClassroomID()+"\tAge group:"+classroom.getEnrollmentRule().getMinAge()+"-"+classroom.getEnrollmentRule().getMaxAge()+"months");
			for (Group group : classroom.getGroupList()) {
				System.out.print("\n\tGroupID:"+group.getGroupID()+"   Teacher Assigned:"+group.getTeacher().getFirstName()+"\n");
				for (Student student : group.getStudentList()) {
					System.out.println("StudentID:"+student.getStudentID()+"\t Age:"+student.getAge()+"months");
				}
			}
		}
		System.out.println("DayCare Demo Done");
	}
	
	

}
