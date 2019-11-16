package edu.neu.csye6200.daycare;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private int groupID;
	private static List<Student> studentList = new ArrayList<Student>(); 
	private static List<Teacher> teacherList = new ArrayList<Teacher>();
	private EnrollmentRules enrollmentRule = null;
	
	public void addStudent(Student student) {
		this.studentList.add(student);
	}
	
	public void addTeacher(Teacher teacher) {
		this.teacherList.add(teacher);
	}

	public int getGroupID() {
		return groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public static List<Student> getStudentList() {
		return studentList;
	}

	public static void setStudentList(List<Student> studentList) {
		Group.studentList = studentList;
	}

	public static List<Teacher> getTeacherList() {
		return teacherList;
	}

	public static void setTeacherList(List<Teacher> teacherList) {
		Group.teacherList = teacherList;
	}

	public EnrollmentRules getEnrollmentRule() {
		return enrollmentRule;
	}

	public void setEnrollmentRule(EnrollmentRules enrollmentRule) {
		this.enrollmentRule = enrollmentRule;
	}

	public Group(int groupID, EnrollmentRules enrollmentRule) {
		super();
		this.groupID = groupID;
		this.enrollmentRule = enrollmentRule;
	}

	public void removeStudent(int studentID) {
		
	}
	
	public void removeTeacher(int teacherID) {
			
	}
	
	public int getGroupSize() {
		return this.studentList.size();
	}

	@Override
	public String toString() {
		return "Group [groupID=" + groupID + ", enrollmentRule=" + enrollmentRule + "]";
	}
	
	public void showGroupDetails() {
		System.out.println(this.toString());
	}
}
