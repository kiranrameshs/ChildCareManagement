package edu.neu.csye6200.daycare;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Driver Execution Start");
		try {
			DayCareController.demo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Driver Execution Done");
	}

}
