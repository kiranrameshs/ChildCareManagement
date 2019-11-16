package edu.neu.csye6200.daycare;

import org.omg.CORBA.DynAnyPackage.InvalidValue;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Driver Execution Start");
		try {
			DayCareController.demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Driver Execution Done");
	}

}
