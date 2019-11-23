package edu.neu.csye6200.daycare.factory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import edu.neu.csye6200.daycare.objects.Teacher;

public class TeacherFactory {
	private static TeacherFactory instance = null;
	
	private TeacherFactory() {
		
	};
	
	public static TeacherFactory getTeacherFactoryObj() {
		if (instance == null) {
			instance = new TeacherFactory();
			return instance;
		}
		else {
			return instance;
		}
	}
	
	
	public List<Teacher>  getTeacherObj(List<String> teacherData) {
		List<Teacher> teacherList = new ArrayList<Teacher>();
		Iterator<String> it = teacherData.iterator();
		String[] eachLine = null;
			while(it.hasNext()) {
				eachLine = it.next().split(",");
				int teacherID            	=new Integer(eachLine[0]);
				String firstName         	=eachLine[1];
				String lastName          	=eachLine[2];
				boolean isAvailable        	=new Boolean(eachLine[3]);
				String address          	=eachLine[4];
				String phoneNumber          =eachLine[5];
				teacherList.add(new Teacher( firstName, lastName, teacherID,  isAvailable,  address, phoneNumber));
					} 
			return teacherList;
	}
		
	}
