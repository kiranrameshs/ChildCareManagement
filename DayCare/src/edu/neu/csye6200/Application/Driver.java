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
Age group mismatch
Rule found
Applicable rule is 13-24
No classrooms available, new class created
No groups available, new group created
groupID set
classID set
Student Enrollemnt Complete
studentID=1,groupID=0, classID=0, fatherName= Aron Tompson, motherName= Emma Tompson, dateOfJoining=Fri Nov 22 00:00:00 EST 2019, groupID=0, classID=0, age=20, address= #60 St Germain, phoneNumber=8888888888DOB: Fri Nov 22 00:00:00 EST 2019
Student Enrollemnt Complete

Age group mismatch
Rule found
Applicable rule is 13-24
classroom.getNumOfGroups()  1  classroom.getEnrollmentRule().getMaxGroup()  2
group.getGroupSize()+12 group.getEnrollmentRule().getGroupSize() 2
Group with vacancy found
groupID set
classID set
Student Enrollemnt Complete
studentID=2,groupID=0, classID=0, fatherName= Ramesh Hunsur, motherName= Subhashini Ramesh, dateOfJoining=Fri Nov 22 00:00:00 EST 2019, groupID=0, classID=0, age=21, address= #65 St Allen, phoneNumber=11111111DOB: Fri Nov 22 00:00:00 EST 2019
Student Enrollemnt Complete

Age group mismatch
Rule found
Applicable rule is 13-24
classroom.getNumOfGroups()  1  classroom.getEnrollmentRule().getMaxGroup()  2
group.getGroupSize()+13 group.getEnrollmentRule().getGroupSize() 2
Group is full
Vacant classroom available, group is full, creating new group
inputs for creating new group are 1  EnrollmentRules [minAge=13, maxAge=24, ageRange=13-24, groupSize=2, ratio=2:1, maxGroup=2]
check ***  1  1   2
groupID set
classID set
Student Enrollemnt Complete
studentID=3,groupID=1, classID=0, fatherName= A, motherName= B, dateOfJoining=Fri Nov 22 00:00:00 EST 2019, groupID=1, classID=0, age=22, address= #67 St burbank, phoneNumber=22222222DOB: Fri Nov 22 00:00:00 EST 2019
Student Enrollemnt Complete

Age group mismatch
Rule found
Applicable rule is 13-24
classroom.getNumOfGroups()  2  classroom.getEnrollmentRule().getMaxGroup()  2
Classroom is full
group.getGroupSize()+13 group.getEnrollmentRule().getGroupSize() 2
group.getGroupSize()+12 group.getEnrollmentRule().getGroupSize() 2
Group with vacancy found
groupID set
classID set
Student Enrollemnt Complete
studentID=4,groupID=1, classID=0, fatherName= C, motherName= D, dateOfJoining=Fri Nov 22 00:00:00 EST 2019, groupID=1, classID=0, age=20, address= #69 St huntington, phoneNumber=3333333333DOB: Fri Nov 22 00:00:00 EST 2019
Student Enrollemnt Complete

Age group mismatch
Rule found
Applicable rule is 13-24
classroom.getNumOfGroups()  2  classroom.getEnrollmentRule().getMaxGroup()  2
Classroom is full
group.getGroupSize()+13 group.getEnrollmentRule().getGroupSize() 2
group.getGroupSize()+13 group.getEnrollmentRule().getGroupSize() 2
classroomFound is false  groupFound  false
Class and group not found
Creating new class and group
groupID set
classID set
Student Enrollemnt Complete
studentID=5,groupID=0, classID=1, fatherName= E, motherName= F, dateOfJoining=Fri Nov 22 00:00:00 EST 2019, groupID=0, classID=1, age=23, address= #70 St smithson, phoneNumber=4444444444DOB: Fri Nov 22 00:00:00 EST 2019
Student Enrollemnt Complete

Age group mismatch
Rule found
Applicable rule is 13-24
classroom.getNumOfGroups()  2  classroom.getEnrollmentRule().getMaxGroup()  2
Classroom is full
group.getGroupSize()+13 group.getEnrollmentRule().getGroupSize() 2
group.getGroupSize()+13 group.getEnrollmentRule().getGroupSize() 2
classroom.getNumOfGroups()  1  classroom.getEnrollmentRule().getMaxGroup()  2
group.getGroupSize()+12 group.getEnrollmentRule().getGroupSize() 2
Group with vacancy found
groupID set
classID set
Student Enrollemnt Complete
studentID=6,groupID=0, classID=1, fatherName= g, motherName= h, dateOfJoining=Fri Nov 22 00:00:00 EST 2019, groupID=0, classID=1, age=23, address= #80 St smithson, phoneNumber=5555555555DOB: Fri Nov 22 00:00:00 EST 2019
Student Enrollemnt Complete

Age group mismatch
Rule found
Applicable rule is 13-24
classroom.getNumOfGroups()  2  classroom.getEnrollmentRule().getMaxGroup()  2
Classroom is full
group.getGroupSize()+13 group.getEnrollmentRule().getGroupSize() 2
group.getGroupSize()+13 group.getEnrollmentRule().getGroupSize() 2
classroom.getNumOfGroups()  1  classroom.getEnrollmentRule().getMaxGroup()  2
group.getGroupSize()+13 group.getEnrollmentRule().getGroupSize() 2
Group is full
Vacant classroom available, group is full, creating new group
inputs for creating new group are 1  EnrollmentRules [minAge=13, maxAge=24, ageRange=13-24, groupSize=2, ratio=2:1, maxGroup=2]
check ***  1  1   2
groupID set
classID set
Student Enrollemnt Complete
studentID=7,groupID=1, classID=1, fatherName= Ea, motherName= Fa, dateOfJoining=Fri Nov 22 00:00:00 EST 2019, groupID=1, classID=1, age=24, address= #90 Sta smithsona, phoneNumber=6666666666DOB: Fri Nov 22 00:00:00 EST 2019
Student Enrollemnt Complete

INITIALIZATION COMPLETE
DayCare Demo Done

ClassID:0	Age group:13-24months
	GroupID:0   Teacher Assigned:TeaOneName
StudentID:1	 Age:20months
StudentID:2	 Age:21months

	GroupID:1   Teacher Assigned:TeaTwoName
StudentID:3	 Age:22months
StudentID:4	 Age:20months

ClassID:1	Age group:13-24months
	GroupID:0   Teacher Assigned:TeathreeName
StudentID:5	 Age:23months
StudentID:6	 Age:23months

	GroupID:1   Teacher Assigned:TeafourName
StudentID:7	 Age:24months
Personal Info
First Name :a
Last Name :b
Mother's Name :ss
Father's Name :dd
Address  :ff
Phone :222
Tue May 01 19:35:51 EDT 2018
Vaccine Details
Received student data for processing
studentData a,b,05/01/2018,ff,dd,ss,222
dOB is Tue May 01 00:00:00 EDT 2018
l1 is 2018-05-01
now1 is 2019-11-22
period age is P1Y6M21D
age:18 months
final studentData before parsing   a,b,05/01/2018,ff,dd,ss,222,11/22/2019,18
Student ID in SINGLE is 8
Age group mismatch
Rule found
Applicable rule is 13-24
classroom.getNumOfGroups()  2  classroom.getEnrollmentRule().getMaxGroup()  2
Classroom is full
group.getGroupSize()+13 group.getEnrollmentRule().getGroupSize() 2
group.getGroupSize()+13 group.getEnrollmentRule().getGroupSize() 2
classroom.getNumOfGroups()  2  classroom.getEnrollmentRule().getMaxGroup()  2
Classroom is full
group.getGroupSize()+13 group.getEnrollmentRule().getGroupSize() 2
group.getGroupSize()+12 group.getEnrollmentRule().getGroupSize() 2
Group with vacancy found
groupID set
classID set
Student Enrollemnt Complete
studentID=8,groupID=1, classID=1, fatherName=dd, motherName=ss, dateOfJoining=Fri Nov 22 00:00:00 EST 2019, groupID=1, classID=1, age=18, address=ff, phoneNumber=222DOB: Tue May 01 00:00:00 EDT 2018
Student Enrollemnt Complete	
 */
}
