package edu.neu.csye6200.daycare;

import java.util.List;

public class Teacher extends Person {
	private int teacherID;
	private List<Student> student;
	private int groupID;
	private int classID;

	public Teacher(String firstName, String lastName, int teacherID, List<Student> student, int groupID) {
		super(firstName, lastName);
		this.teacherID = teacherID;
		this.student = student;
		this.groupID = groupID;
	}
}
