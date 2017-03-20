package com.cisc181.core;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	static ArrayList<Staff> Stafflist = new ArrayList<Staff>();
	
	@BeforeClass
	public static void setup() throws Exception{
		Stafflist.add(new Staff("Tommy", "Lee", "Jones", new Date(0), "Main Street", "(555)-555-5555", "TLJ1@udel.edu",
				"2:00-2:30", 1, 100000, new Date(1), eTitle.SPONGEBOB));
		Stafflist.add(new Staff("Tommy", "Lee", "Jones", new Date(0), "Main Street", "(555)-555-5556", "TLJ2@udel.edu",
				"3:00-3:30", 2, 90000, new Date(1), eTitle.PATRICK));
		Stafflist.add(new Staff("Tommy", "Lee", "Jones", new Date(0), "Main Street", "(555)-555-5557", "TLJ3@udel.edu",
				"4:00-4:30", 3, 80000, new Date(1), eTitle.PATRICK));
		Stafflist.add(new Staff("Tommy", "Lee", "Jones", new Date(0), "Main Street", "(555)-555-5558", "TLJ4@udel.edu",
				"5:00-5:30", 4, 70000, new Date(1), eTitle.SANDY));
		Stafflist.add(new Staff("Tommy", "Lee", "Jones", new Date(0), "Main Street", "(555)-555-5559", "TLJ5@udel.edu",
				"6:00-6:30", 5, 60000, new Date(1), eTitle.SANDY));
	}
	
	@Test
	public void AvgSal() {
		double sum = 0;
		double avg = 0;
		for(Staff Tom : Stafflist){
			sum += Tom.getSalary();
		}
		avg = sum / Stafflist.size();
		assertEquals(avg, 70000,0.01);
	}	
	@Test
	public void TestPhoneNumberTest() throws Exception{
		try{
			Stafflist.add(new Staff("Tommy", "Lee", "Jones", new Date(0), "Main Street", "5555555550", "TLJ6@udel.edu",
					"7:00-7:30", 6, 50000, new Date(1), eTitle.SANDY));
		} catch(Exception e){
		System.out.println("Not valid number");
		e.printStackTrace();
		}
	}
	@Test
	public void TestDOB() throws Exception{
		try{
			Stafflist.add(new Staff("Tommy", "Lee", "Jones", new Date(1900), "Main Street", "(555)-555-5551", "TLJ7@udel.edu",
					"8:00-8:30", 7, 40000, new Date(1), eTitle.SANDY));
		} catch(Exception e){
		System.out.println("Not valid year");
		e.printStackTrace();
		}
	}	
}