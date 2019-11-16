package edu.neu.csye6200.daycare;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class StudentFactory {
	private static StudentFactory instance = null;
	private static int studentCount = 0;
	//private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	private static DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
	private StudentFactory() {
	}
	
	public static StudentFactory getObj() {
		if (instance == null) {
			instance = new StudentFactory();
		}
		return instance;
	}
	
	
	//initialising at startup
	public  List<Student> initStudentObj (List<String> data) throws ParseException {
		
		String[] eachLine = null;
		List<Student> studentList =  new Vector<Student>();
		Iterator<String> it = data.iterator();
			while(it.hasNext()) {
				eachLine = it.next().split(",");
				int studentID            			=new Integer(eachLine[0]);
				String firstName         	=eachLine[1];
				String lastName          	=eachLine[2];
				int age            			=new Integer(eachLine[3]);
				String address          	=eachLine[4];
				String fatherName          	=eachLine[5];
				String motherName          	=eachLine[6];
				String phoneNumber          =eachLine[7];
				String dateOfJoining          =eachLine[8];
				int groupID            			=new Integer(eachLine[9]);
				int classID            			=new Integer(eachLine[10]);
				studentList.add(new Student( studentID, firstName,  lastName,  age,  address,  fatherName,  motherName, phoneNumber, dateFormat.parse(dateOfJoining), groupID, classID));
					} 
			return studentList;
	}
	
	public static Student getStudentObj (String data) throws ParseException {
		studentCount +=1;
//		Scanner scanStudent = new Scanner(data);
//		scanStudent.useDelimiter(",");
//				String firstName         	=scanStudent.next();
//				String lastName          	=scanStudent.next();
//				//System.out.println("next is "+scanStudent.nextInt());
//				if (scanStudent.hasNextInt()) { 
//	                System.out.println("Found Int value :"
//	                                   + scanStudent.nextInt()); 
//	            } 
//	  
//	            else { 
//	                System.out.println("Not found Int value :"
//	                                   + scanStudent.next()); 
//	            } 
//				int age            			=scanStudent.nextInt();
//				String address          	=scanStudent.next();
//				String fatherName         	=scanStudent.next();
//				String motherName         	=scanStudent.next();
//				String phoneNumber          =scanStudent.next();
//				String dateOfJoining          =scanStudent.next();
		
				String[] eachLine = null;
				eachLine = data.split(",");
				String firstName         	=eachLine[0];
				String lastName          	=eachLine[1];
				Integer age            			=new Integer(eachLine[2]);
				String address          	=eachLine[3];
				String fatherName          	=eachLine[4];
				String motherName          	=eachLine[5];
				String phoneNumber          =eachLine[6];
				String dateOfJoining          =eachLine[7];
				Student studentObj = new Student( firstName,  lastName,  age,  address,  fatherName,  motherName, phoneNumber, dateFormat.parse(dateOfJoining) , studentCount);
				//scanStudent.close();
		return studentObj;
		}
}

	