package edu.neu.csye6200.daycare;

public class DayCareFactory {
	private static DayCareFactory instance = null;
	private DayCareFactory() {
	}
	
	public static DayCareFactory getObj() {
		if (instance == null) {
			instance = new DayCareFactory();
		}
		return instance;
	}
	
	public  DayCareController getDayCareObj() {
			 DayCareController dayCare = new DayCareController();
			return dayCare;
	} 
}