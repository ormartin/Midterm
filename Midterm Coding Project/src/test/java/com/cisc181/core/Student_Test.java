package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	
	@BeforeClass
	public static void setup() {
		ArrayList<Course> Courselist = new ArrayList<Course>();
		Courselist.add(new Course("CHEM101", 4, eMajor.CHEM));
		Courselist.add(new Course("PHYSICS101", 4, eMajor.PHYSICS));
		Courselist.add(new Course("BUSINESS101", 4, eMajor.BUSINESS));
		
		ArrayList<Semester> Semesterlist = new ArrayList<Semester>();
		Semesterlist.add(new Semester(new Date(0), new Date(1)));
		Semesterlist.add(new Semester(new Date(2), new Date(3)));
		
		ArrayList<Section> Sectionlist = new ArrayList<Section>();
		//Not too sure how to go about with UUIDs
		
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}