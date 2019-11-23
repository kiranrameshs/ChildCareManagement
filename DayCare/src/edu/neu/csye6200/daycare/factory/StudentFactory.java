package edu.neu.csye6200.daycare.factory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

import edu.neu.csye6200.daycare.objects.Student;

public class StudentFactory {
	private static StudentFactory instance = null;
	private static int studentCount = 0;
	private static DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
	static SimpleDateFormat sdf = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy",
            Locale.ENGLISH);
	private StudentFactory() {
	}
	
	
	//INIT
	public  List<Student> initStudentObj (List<String> data) throws ParseException {
		String[] eachLine = null;
		List<Student> studentList =  new Vector<Student>();
		Iterator<String> it = data.iterator();
			while(it.hasNext()) {
				studentCount +=1;
				System.out.println("Student ID in initStudentObj is "+studentCount);
				eachLine = it.next().split(",");
				System.out.println("eachLine[0] is"+eachLine[0]);
				if(eachLine[0] == "\n") {
					System.out.println("Empty line encountered");
					continue;
				}
				int studentID            			=new Integer(eachLine[0]);
				String firstName         	=eachLine[1];
				String lastName          	=eachLine[2];
				int age            			=new Integer(eachLine[3]);
				String address          	=eachLine[4];
				String fatherName          	=eachLine[5];
				String motherName          	=eachLine[6];
				String phoneNumber          =eachLine[7];
				String dateOfJoining          =eachLine[8];
				String dateOfBirth          =eachLine[9];
				
				studentList.add(new Student( firstName,  lastName,  age,  address,  fatherName,  motherName, phoneNumber, dateFormat.parse(dateOfJoining), studentID, dateFormat.parse(dateOfBirth)));
				} 
			return studentList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static StudentFactory getObj() {
		if (instance == null) {
			instance = new StudentFactory();
		}
		return instance;
	}
	

	

	
		//SINGLE
	public static Student getStudentObj (String data) throws ParseException {
		studentCount +=1;
		System.out.println("Student ID in SINGLE is "+studentCount);
				String[] eachLine = null;
				eachLine = data.split(",");
				String firstName         	=eachLine[0];
				String lastName          	=eachLine[1];
				String dateOfBirth         =eachLine[2];
				String address          	=eachLine[3];
				String fatherName          	=eachLine[4];
				String motherName          	=eachLine[5];
				String phoneNumber          =eachLine[6];
				String dateOfJoining          =eachLine[7];
				Integer age            			=new Integer(eachLine[8]);
				Student studentObj = new Student( firstName,  lastName,  age,  address,  fatherName,  motherName, phoneNumber, dateFormat.parse(dateOfJoining) , studentCount, dateFormat.parse(dateOfBirth));
				//scanStudent.close();
		return studentObj;
		}
}

	