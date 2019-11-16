package edu.neu.csye6200.daycare;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Student extends Person {
	private int studentID;
	private String fatherName;
	private String motherName;
	private List<Vaccine> immunizationRecord;
	private Date dateOfJoining;
	private int groupID;
	private int classID;
	private int age;
	private String address;
	private String phoneNumber;


	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", fatherName=" + fatherName + ", motherName=" + motherName
				+ ", immunizationRecord=" + immunizationRecord + ", dateOfJoining=" + dateOfJoining + ", groupID="
				+ groupID + ", classID=" + classID + ", age=" + age + ", address=" + address + ", phoneNumber="
				+ phoneNumber + "]";
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Student(String firstName, String lastName, int age, String address, String fatherName, String motherName,String phoneNumber, Date dateOfJoining,int studentID) {
		super(firstName, lastName);
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.studentID = studentID;
	}
	
	//reading from csv to init
	public Student(int studentID, String firstName, String lastName, int age, String address, String fatherName, String motherName,String phoneNumber, Date dateOfJoining, int groupID, int classID) {
		super(firstName, lastName);
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.studentID = studentID;
		this.groupID = groupID;
		this.classID = classID;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public List<Vaccine> getImmunizationRecord() {
		return immunizationRecord;
	}
	public void setImmunizationRecord(List<Vaccine> immunizationRecord) {
		this.immunizationRecord = immunizationRecord;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getGroupID() {
		return groupID;
	}
	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}
	public int getClassID() {
		return classID;
	}
	public void setClassID(int classID) {
		this.classID = classID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void showStudentDetails() {
		System.out.println(this.toString());
	}
	


}
