package edu.neu.csye6200.Application;

import javax.swing.SwingUtilities;

import edu.neu.csye6200.daycare.controller.DayCareController;
import edu.neu.csye6200.daycare.views.MainPage; 
public class Driver {

	public static void main(String[] args) {
		 SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    createAndShowGUI();
	                } catch (Exception e) {
	                	e.printStackTrace();
	                						}
	            	}
		});
}
	
	public static void createAndShowGUI() throws Exception {
        MainPage mainPage = new MainPage();
        mainPage.setVisible(true);
    }

	
/**
 * OUTPUT
 * Init components complete
DayCare Demo 
DayCare Factory obj created
DayCare obj  created
Rules factory obj  created
Rule objs created
Student Factory obj
Teacher Factory obj
Reading from file teacher.csv complete
Teacher File read successfully
Reading from file student.csv complete
Student File read successfully
Student ID in initStudentObj is 1
Student ID in initStudentObj is 2
Student ID in initStudentObj is 3
Student ID in initStudentObj is 4
Student ID in initStudentObj is 5
Student ID in initStudentObj is 6
Student ID in initStudentObj is 7
Student ID in initStudentObj is 8
Student ID in initStudentObj is 9
Student ID in initStudentObj is 10
Student ID in initStudentObj is 11
Student ID in initStudentObj is 12
Student ID in initStudentObj is 13
Student ID in initStudentObj is 14
Student ID in initStudentObj is 15
Student ID in initStudentObj is 16
Student ID in initStudentObj is 17
Student ID in initStudentObj is 18
Student ID in initStudentObj is 19
Age group mismatch
Age group mismatch
Age group mismatch
Age group mismatch
Rule found
Applicable rule is 48-59
No classrooms available, new class created
No groups available, new group created
groupID set
classID set
Student Enrollemnt Complete
studentID=1,groupID=0, classID=0, fatherName=Emma Tompson, motherName=Jimmy Tompson, dateOfJoining=Sat Nov 23 00:00:00 EST 2019, groupID=0, classID=0, age=53, address=#60 St Germain Street, phoneNumber=8888888888DOB: Tue Jun 23 00:00:00 EDT 2015
Student Enrollemnt Complete

Age group mismatch
Age group mismatch
Age group mismatch
Rule found
Applicable rule is 36-47
Class rule mismatch
classroomFound is false  groupFound  false
Class and group not found
Creating new class and group
groupID set
classID set
Student Enrollemnt Complete
studentID=2,groupID=0, classID=1, fatherName=Isabella George, motherName=Sally George, dateOfJoining=Sat Nov 23 00:00:00 EST 2019, groupID=0, classID=1, age=39, address=#60 St Germain Street, phoneNumber=8888888888DOB: Tue Aug 23 00:00:00 EDT 2016
Student Enrollemnt Complete

Age group mismatch
Age group mismatch
Age group mismatch
Rule found
Applicable rule is 36-47
Class rule mismatch
classroom.getNumOfGroups()  1  classroom.getEnrollmentRule().getMaxGroup()  3
group.getGroupSize()+12 group.getEnrollmentRule().getGroupSize() 8
Group with vacancy found
groupID set
classID set
Student Enrollemnt Complete
studentID=3,groupID=0, classID=1, fatherName=Madison Edwen, motherName=Lizzy Edwen, dateOfJoining=Sat Nov 23 00:00:00 EST 2019, groupID=0, classID=1, age=36, address=#60 St Germain Street, phoneNumber=8888888888DOB: Wed Nov 23 00:00:00 EST 2016
Student Enrollemnt Complete

Age group mismatch
Age group mismatch
Rule found
Applicable rule is 25-35
Class rule mismatch
Class rule mismatch
classroomFound is false  groupFound  false
Class and group not found
Creating new class and group
groupID set
classID set
Student Enrollemnt Complete
studentID=4,groupID=0, classID=2, fatherName=Olivia James, motherName=Markie James, dateOfJoining=Sat Nov 23 00:00:00 EST 2019, groupID=0, classID=2, age=35, address=#60 St Germain Street, phoneNumber=8888888888DOB: Fri Dec 23 00:00:00 EST 2016
Student Enrollemnt Complete

Age group mismatch
Age group mismatch
Age group mismatch
Rule found
Applicable rule is 36-47
Class rule mismatch
classroom.getNumOfGroups()  1  classroom.getEnrollmentRule().getMaxGroup()  3
group.getGroupSize()+13 group.getEnrollmentRule().getGroupSize() 8
Group with vacancy found
groupID set
classID set
Student Enrollemnt Complete
studentID=5,groupID=0, classID=1, fatherName=Mia Dep, motherName=Johnny Dep, dateOfJoining=Sat Nov 23 00:00:00 EST 2019, groupID=0, classID=1, age=44, address=#60 St Germain Street, phoneNumber=8888888888DOB: Wed Mar 23 00:00:00 EDT 2016
Student Enrollemnt Complete

Age group mismatch
Age group mismatch
Age group mismatch
Rule found
Applicable rule is 36-47
Class rule mismatch
classroom.getNumOfGroups()  1  classroom.getEnrollmentRule().getMaxGroup()  3
group.getGroupSize()+14 group.getEnrollmentRule().getGroupSize() 8
Group with vacancy found
groupID set
classID set
Student Enrollemnt Complete
studentID=6,groupID=0, classID=1, fatherName=Elizabeth Higgins, motherName=Bobby Higgins, dateOfJoining=Sat Nov 23 00:00:00 EST 2019, groupID=0, classID=1, age=42, address=#60 St Germain Street, phoneNumber=8888888888DOB: Mon May 23 00:00:00 EDT 2016
Student Enrollemnt Complete

Age group mismatch
Rule found
Applicable rule is 13-24
Class rule mismatch
Class rule mismatch
Class rule mismatch
classroomFound is false  groupFound  false
Class and group not found
Creating new class and group
groupID set
classID set
Student Enrollemnt Complete
studentID=7,groupID=0, classID=3, fatherName=Addison Hill, motherName=Billy Hill, dateOfJoining=Sat Nov 23 00:00:00 EST 2019, groupID=0, classID=3, age=16, address=#60 St Germain Street, phoneNumber=8888888888DOB: Mon Jul 23 00:00:00 EDT 2018
Student Enrollemnt Complete

Age group mismatch
Age group mismatch
Rule found
Applicable rule is 25-35
Class rule mismatch
Class rule mismatch
classroom.getNumOfGroups()  1  classroom.getEnrollmentRule().getMaxGroup()  3
group.getGroupSize()+12 group.getEnrollmentRule().getGroupSize() 6
Group with vacancy found
groupID set
classID set
Student Enrollemnt Complete
studentID=8,groupID=0, classID=2, fatherName=Alyssa Jane, motherName=Evie Jane, dateOfJoining=Sat Nov 23 00:00:00 EST 2019, groupID=0, classID=2, age=28, address=#60 St Germain Street, phoneNumber=8888888888DOB: Sun Jul 23 00:00:00 EDT 2017
Student Enrollemnt Complete

Age group mismatch
Age group mismatch
Rule found
Applicable rule is 25-35
Class rule mismatch
Class rule mismatch
classroom.getNumOfGroups()  1  classroom.getEnrollmentRule().getMaxGroup()  3
group.getGroupSize()+13 group.getEnrollmentRule().getGroupSize() 6
Group with vacancy found
groupID set
classID set
Student Enrollemnt Complete
studentID=9,groupID=0, classID=2, fatherName=Hannah Smith, motherName=Becky Smith, dateOfJoining=Sat Nov 23 00:00:00 EST 2019, groupID=0, classID=2, age=27, address=#60 St Germain Street, phoneNumber=8888888888DOB: Wed Aug 23 00:00:00 EDT 2017
Student Enrollemnt Complete

Age group mismatch
Rule found
Applicable rule is 13-24
Class rule mismatch
Class rule mismatch
Class rule mismatch
classroom.getNumOfGroups()  1  classroom.getEnrollmentRule().getMaxGroup()  3
group.getGroupSize()+12 group.getEnrollmentRule().getGroupSize() 5
Group with vacancy found
groupID set
classID set
Student Enrollemnt Complete
studentID=10,groupID=0, classID=3, fatherName=Alexis Christin, motherName=Jessie Christin, dateOfJoining=Sat Nov 23 00:00:00 EST 2019, groupID=0, classID=3, age=23, address=#60 St Germain Street, phoneNumber=8888888888DOB: Sat Dec 23 00:00:00 EST 2017
Student Enrollemnt Complete

Age group mismatch
Rule found
Applicable rule is 13-24
Class rule mismatch
Class rule mismatch
Class rule mismatch
classroom.getNumOfGroups()  1  classroom.getEnrollmentRule().getMaxGroup()  3
group.getGroupSize()+13 group.getEnrollmentRule().getGroupSize() 5
Group with vacancy found
groupID set
classID set
Student Enrollemnt Complete
studentID=11,groupID=0, classID=3, fatherName=Alyssa Chan, motherName=Jackie Chan, dateOfJoining=Sat Nov 23 00:00:00 EST 2019, groupID=0, classID=3, age=18, address=#60 St Germain Street, phoneNumber=8888888888DOB: Wed May 23 00:00:00 EDT 2018
Student Enrollemnt Complete

Age group mismatch
Rule found
Applicable rule is 13-24
Class rule mismatch
Class rule mismatch
Class rule mismatch
classroom.getNumOfGroups()  1  classroom.getEnrollmentRule().getMaxGroup()  3
group.getGroupSize()+14 group.getEnrollmentRule().getGroupSize() 5
Group with vacancy found
groupID set
classID set
Student Enrollemnt Complete
studentID=12,groupID=0, classID=3, fatherName=Ashley Florance, motherName=Laurie Florance, dateOfJoining=Sat Nov 23 00:00:00 EST 2019, groupID=0, classID=3, age=22, address=#60 St Germain Street, phoneNumber=8888888888DOB: Tue Jan 23 00:00:00 EST 2018
Student Enrollemnt Complete

Age group mismatch
Rule found
Applicable rule is 13-24
Class rule mismatch
Class rule mismatch
Class rule mismatch
classroom.getNumOfGroups()  1  classroom.getEnrollmentRule().getMaxGroup()  3
group.getGroupSize()+15 group.getEnrollmentRule().getGroupSize() 5
Group with vacancy found
groupID set
classID set
Student Enrollemnt Complete
studentID=13,groupID=0, classID=3, fatherName=Ella Methew, motherName=Cathey Methew, dateOfJoining=Sat Nov 23 00:00:00 EST 2019, groupID=0, classID=3, age=17, address=#60 St Germain Street, phoneNumber=8888888888DOB: Sat Jun 23 00:00:00 EDT 2018
Student Enrollemnt Complete

Age group mismatch
Age group mismatch
Age group mismatch
Age group mismatch
Age group mismatch
Rule found
Applicable rule is 60-100
Class rule mismatch
Class rule mismatch
Class rule mismatch
Class rule mismatch
classroomFound is false  groupFound  false
Class and group not found
Creating new class and group
groupID set
classID set
Student Enrollemnt Complete
studentID=14,groupID=0, classID=4, fatherName=Sarah Tompson, motherName=Millie Tompson, dateOfJoining=Sat Nov 23 00:00:00 EST 2019, groupID=0, classID=4, age=63, address=#60 St Germain Street, phoneNumber=8888888888DOB: Sat Aug 23 00:00:00 EDT 2014
Student Enrollemnt Complete

Age group mismatch
Rule found
Applicable rule is 13-24
Class rule mismatch
Class rule mismatch
Class rule mismatch
classroom.getNumOfGroups()  1  classroom.getEnrollmentRule().getMaxGroup()  3
group.getGroupSize()+16 group.getEnrollmentRule().getGroupSize() 5
Group is full
Vacant classroom available, group is full, creating new group
inputs for creating new group are 1  EnrollmentRules [minAge=13, maxAge=24, ageRange=13-24, groupSize=5, ratio=5:1, maxGroup=3]
check ***  1  1   5
groupID set
classID set
Student Enrollemnt Complete
studentID=15,groupID=1, classID=3, fatherName=Taylor Jesus, motherName=Ruthie Jesus, dateOfJoining=Sat Nov 23 00:00:00 EST 2019, groupID=1, classID=3, age=16, address=#60 St Germain Street, phoneNumber=8888888888DOB: Mon Jul 23 00:00:00 EDT 2018
Student Enrollemnt Complete

Age group mismatch
Rule found
Applicable rule is 13-24
Class rule mismatch
Class rule mismatch
Class rule mismatch
classroom.getNumOfGroups()  2  classroom.getEnrollmentRule().getMaxGroup()  3
group.getGroupSize()+16 group.getEnrollmentRule().getGroupSize() 5
Group is full
group.getGroupSize()+12 group.getEnrollmentRule().getGroupSize() 5
Group with vacancy found
groupID set
classID set
Student Enrollemnt Complete
studentID=16,groupID=1, classID=3, fatherName=Grace Mart, motherName=Stanley Mart, dateOfJoining=Sat Nov 23 00:00:00 EST 2019, groupID=1, classID=3, age=15, address=#60 St Germain Street, phoneNumber=8888888888DOB: Thu Aug 23 00:00:00 EDT 2018
Student Enrollemnt Complete

Rule found
Applicable rule is 6-12
Class rule mismatch
Class rule mismatch
Class rule mismatch
Class rule mismatch
Class rule mismatch
classroomFound is false  groupFound  false
Class and group not found
Creating new class and group
groupID set
classID set
Student Enrollemnt Complete
studentID=17,groupID=0, classID=5, fatherName=Lily Mandery, motherName=Mary Mandery, dateOfJoining=Sat Nov 23 00:00:00 EST 2019, groupID=0, classID=5, age=12, address=#60 St Germain Street, phoneNumber=8888888888DOB: Fri Nov 23 00:00:00 EST 2018
Student Enrollemnt Complete

Age group mismatch
Age group mismatch
Age group mismatch
Age group mismatch
Age group mismatch
Rule found
Applicable rule is 60-100
Class rule mismatch
Class rule mismatch
Class rule mismatch
Class rule mismatch
classroom.getNumOfGroups()  1  classroom.getEnrollmentRule().getMaxGroup()  2
group.getGroupSize()+12 group.getEnrollmentRule().getGroupSize() 15
Group with vacancy found
groupID set
classID set
Student Enrollemnt Complete
studentID=18,groupID=0, classID=4, fatherName=Kylie Johns, motherName=Annie Johns, dateOfJoining=Sat Nov 23 00:00:00 EST 2019, groupID=0, classID=4, age=63, address=#60 St Germain Street, phoneNumber=8888888888DOB: Sat Aug 23 00:00:00 EDT 2014
Student Enrollemnt Complete

Rule found
Applicable rule is 6-12
Class rule mismatch
Class rule mismatch
Class rule mismatch
Class rule mismatch
Class rule mismatch
classroom.getNumOfGroups()  1  classroom.getEnrollmentRule().getMaxGroup()  3
group.getGroupSize()+12 group.getEnrollmentRule().getGroupSize() 4
Group with vacancy found
groupID set
classID set
Student Enrollemnt Complete
studentID=19,groupID=0, classID=5, fatherName=Brooke Karren, motherName=Karlly Karren, dateOfJoining=Sat Nov 23 00:00:00 EST 2019, groupID=0, classID=5, age=11, address=#60 St Germain Street, phoneNumber=8888888888DOB: Sun Dec 23 00:00:00 EST 2018
Student Enrollemnt Complete

INITIALIZATION COMPLETE
DayCare Demo Done
Personal Info
First Name :Kiran
Last Name :Ramesh
Mother's Name :Subhashini
Father's Name :Ramesh
Address  :#60 St Germain
Phone :1234567890
Fri Dec 11 16:28:10 EST 2015
Vaccine Details
Received student data for processing
studentData Kiran,Ramesh,12/11/2015,#60 St Germain,Ramesh,Subhashini,1234567890
dOB is Fri Dec 11 00:00:00 EST 2015
l1 is 2015-12-11
now1 is 2019-11-23
period age is P3Y11M12D
age:47 months
final studentData before parsing   Kiran,Ramesh,12/11/2015,#60 St Germain,Ramesh,Subhashini,1234567890,11/23/2019,47
Student ID in SINGLE is 20
Age group mismatch
Age group mismatch
Age group mismatch
Rule found
Applicable rule is 36-47
Class rule mismatch
classroom.getNumOfGroups()  1  classroom.getEnrollmentRule().getMaxGroup()  3
group.getGroupSize()+15 group.getEnrollmentRule().getGroupSize() 8
Group with vacancy found
groupID set
classID set
Student Enrollemnt Complete
studentID=20,groupID=0, classID=1, fatherName=Ramesh, motherName=Subhashini, dateOfJoining=Sat Nov 23 00:00:00 EST 2019, groupID=0, classID=1, age=47, address=#60 St Germain, phoneNumber=1234567890DOB: Fri Dec 11 00:00:00 EST 2015
Student Enrollemnt Complete

data to be written is 20,Kiran,Ramesh,47,#60 St Germain,Ramesh,Subhashini,1234567890,11/23/2019,12/11/2015
Writing to file student.csv complete

 */
}
