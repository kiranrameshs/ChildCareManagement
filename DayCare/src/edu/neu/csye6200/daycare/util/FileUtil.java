package edu.neu.csye6200.daycare.util;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/*
 * FileUtil is a class used for file I/O operations
 */
public class FileUtil {
	
	/**
	 * write a CSV file 
	 * @param fileName text file name
	 * @param data list of string data to be written to a file
	 */
	public static void writeTextFile(String fileName, List<String> data) {
		try(BufferedWriter out = new BufferedWriter(new FileWriter(fileName))) {
			for (String line : data) {
				out.write(line);
				out.newLine();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Writing to file "+fileName+" complete");
	}
	
	public static void appendTextFile(String fileName, String data) {
		try(BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true))) {
				out.write(data);
				out.newLine();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Writing to file "+fileName+" complete");
	}
	
	
	/**
	 * read from a CSV file
	 * @param fileName text file name
	 * @return data list of strings from the file
	 */
	public List<String> readTextFile( String fileName) {
		List<String> data = new ArrayList<String>();
		String thisLine = null;
		try (FileReader fr = new FileReader(fileName);BufferedReader br = new BufferedReader(fr);){
			while((thisLine = br.readLine())!= null) {
				if (thisLine.isEmpty() || thisLine.trim().equals("") || thisLine.trim().equals("\n")) {
				 System.out.println("Empty line encountered, skipping");
				        continue;
				    }
				data.add(thisLine);	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Reading from file "+fileName+" complete");
		return data;
	}
}