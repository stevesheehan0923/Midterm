package com.cisc181.core;

import java.util.UUID;

public class Enrollment 
{
	private UUID EnrollmentID;
	private double grade;
	private UUID SectionID;
	private UUID StudentID;
	private Enrollment() 
	{
		super();
	}
	public Enrollment(UUID sectionID, UUID studentID) 
	{
		super();
		SectionID = sectionID;
		StudentID = studentID;
		EnrollmentID = UUID.randomUUID();
	}
	public UUID getEnrollmentID() 
	{
		return EnrollmentID;
	}
	public double getGrade() 
	{
		return grade;
	}
	public UUID getSectionID() 
	{
		return SectionID;
	}
	public UUID getStudentID() 
	{
		return StudentID;
	}
	private void setEnrollmentID(UUID enrollmentID) 
	{
		EnrollmentID = enrollmentID;
	}
	public void setGrade(double grade) 
	{
		this.grade = grade;
	}
	private void setSectionID(UUID sectionID) 
	{
		SectionID = sectionID;
	}
	private void setStudentID(UUID studentID) 
	{
		StudentID = studentID;
	}
	
	
}
