package edu.neu.csye6200.daycare;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DayCareController {
	private static final String studentFileName = "student.csv";
	private static final String teacherFileName = "teacher.csv";
	
	public static String getDateformat() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate localDate = LocalDate.now();
		String date = DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate);
		return date;
	}
	
	public void addClassroom(Classroom classroom) {
		
	}
	
	public void removeClassroom(Classroom classroom) {
		
	}
	
	public void addClassroomID(int classroomID) {
		
	}
	
	public void removeClassroomID(Classroom classroomID) {
		
	}
	
	public static Student parseStudentListCreateObj (String data) {
		Scanner scanStudent = new Scanner(data);
		scanStudent.useDelimiter(",");
				String firstName         	=scanStudent.next();
				String lastName          	=scanStudent.next();
				String address          	=scanStudent.next();
				int age            			=scanStudent.nextInt();
				String phoneNumber          =scanStudent.next();
				int studentID            		=scanStudent.nextInt();
				String parentName          	=scanStudent.next();
				Student studentObj = new Student(firstName, lastName, address, age, phoneNumber, studentID, parentName, null, LocalDate.now());
				scanStudent.close();
		return studentObj;
		}
	
	public static void demo() {
		System.out.println("DayCare Demo ");
		FileUtil fileutil = new FileUtil();
		
		//Store data read from file in file_data, call readTextFile using FileUtil object passing filename
		List<String> student_data = fileutil.readTextFile(studentFileName);
		for (String student : student_data) {
			System.out.println(student);
		}
		
		//Store data read from file in file_data, call readTextFile using FileUtil object passing filename
		List<String> teacher_data = fileutil.readTextFile(teacherFileName);
		for (String teacher : teacher_data) {
			System.out.println(teacher);
		}
		//Get DayCare factory obj from DayCare factory
		DayCareFactory  factoryObj = DayCareFactory.getObj();
		
		DayCareController DayCare = factoryObj.getDayCareObj();
		
		
		
		
		

		
		System.out.println("DayCare Demo Done");
	}
	
	

}