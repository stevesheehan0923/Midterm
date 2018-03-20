package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test 
{

	@BeforeClass
	public static void setup() 
	{
		
	}
	
	@Test
	public void testSalary() throws PersonException 
	{
		ArrayList<Staff> staffList= new ArrayList<Staff>();
        Staff A= new Staff("Stephen", "Edward", "Sheehan", new Date(1998,9,23), "123 Student Lane Doylestown Pennsylvania 18902", "323-456-0890", "actuarysciencemajor@udel.edu", "12pm-6pm", 1, 12324.00, new Date(2017,8,1), eTitle.MR);
        Staff B= new Staff("Jake", "Stephen", "Screen", new Date(1998,9,11), "385 Hogwarts Street Miami Florida 20384", "123-454-3210", "iamawizard@udel.edu", "10am-2pm", 1, 9483.00, new Date(2017,8,1), eTitle.MR);
        Staff C= new Staff("Anton", "Derek", "Hovanec", new Date(1999,3,25), "200 Gamer Drive Newark Delaware 19782", "444-555-6666", "greenalienlaptop@udel.edu", "2-7pm", 1, 12344.00, new Date(2017,8,1), eTitle.MR);
        Staff D= new Staff("Travis", "Ramroop", "Bahadur", new Date(1999,1,14), "100 Panek Drive Uptown New York 66443", "999-666-9999", "soontobemathmajor@udel.edu", "6-11pm", 1, 1233.00, new Date(2017,8,1), eTitle.MR);
        Staff E= new Staff("Jane", "Doe", "Smith", new Date(1977,7,7), "777 Lucky Lane Las Vegas Nevada 77777", "777-777-7777", "igetluckyattheslots@gmail.com", "7am-7pm", 1, 7777.00, new Date(2017,8,1), eTitle.MRS);
		staffList.add(A);
		staffList.add(B);
		staffList.add(C);
		staffList.add(D);
		staffList.add(E);
		double totalSalary = 0;
		for (Staff s : staffList)
		{
			totalSalary = totalSalary + s.getSalary();
		}
		int averageSalary = (int)totalSalary/staffList.size();
		
        assertEquals(averageSalary,8632);
        
	}
	@Test (expected = PersonException.class)
	public void testBirthDate() throws PersonException
	{
		Staff StaffF = new Staff("Jimmy", "Jared" ,"Jenkins", new Date(666,6,6), "666 Devil Lane Bristol Conneticut 06010", "666-666-6666", "iamthedevil@verizon.net", "6am-6pm", 1, 666.00, new Date(2017,8,1), eTitle.MR);
	}
	@Test (expected = PersonException.class)
	public void testPhoneNumber() throws PersonException
	{
		Staff StaffF = new Staff("Jimmy", "Jared" ,"Jenkins", new Date(1966,6,6), "666 Devil Lane Bristol Conneticut 06010", "666-666-666", "iamthedevil@verizon.net", "6am-6pm", 1, 666.00, new Date(2017,8,1), eTitle.MR);
	}

}
