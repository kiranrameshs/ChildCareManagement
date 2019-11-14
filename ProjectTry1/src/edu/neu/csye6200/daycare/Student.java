package edu.neu.csye6200.daycare;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Student extends Person {
	private int studentID;
	private String parentName;
	private List<Vaccine> immunizationRecord;
	private LocalDate dateOfJoining;
	
	public Student(String firstName, String lastName, String address, Integer age, String phoneNumber, int studentID,
			String parentName, List<Vaccine> immunizationRecord, LocalDate dateOfJoining) {
		super(firstName, lastName, address, age, phoneNumber);
		this.studentID = studentID;
		this.parentName = parentName;
		this.immunizationRecord = immunizationRecord;
		this.dateOfJoining = dateOfJoining;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public List<Vaccine> getImmunizationRecord() {
		return immunizationRecord;
	}

	public void setImmunizationRecord(List<Vaccine> immunizationRecord) {
		this.immunizationRecord = immunizationRecord;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	

}