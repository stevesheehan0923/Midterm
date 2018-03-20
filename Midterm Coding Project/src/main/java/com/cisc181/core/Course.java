package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Course 
{
	private UUID CourseID;
	private String CourseName;
	private eMajor eMajor;
	private int GradePoints;

	
	public Course(UUID courseID, String courseName, int gradePoints, com.cisc181.eNums.eMajor eMajor) 
	{
		super();
		CourseID = courseID;
		CourseName = courseName;
		GradePoints = gradePoints;
		this.eMajor = eMajor;
	}
	public UUID getCourseID() 
	{
		return CourseID;
	}
	public String getCourseName() 
	{
		return CourseName;
	}
	public eMajor geteMajor() 
	{
		return eMajor;
	}
	public int getGradePoints() 
	{
		return GradePoints;
	}
	private void setCourseID(UUID courseID) 
	{
		CourseID = courseID;
	}
	private void setCourseName(String courseName) 
	{
		CourseName = courseName;
	}
	private void seteMajor(eMajor eMajor) 
	{
		this.eMajor = eMajor;
	}
	private void setGradePoints(int gradePoints) 
	{
		GradePoints = gradePoints;
	}
}
