package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test 
{
	static ArrayList<Course> courseList = new ArrayList<Course>();
	static ArrayList<Enrollment> enrollmentList = new ArrayList<Enrollment>();
	static ArrayList<Section> sectionList = new ArrayList<Section>();
	static ArrayList<Semester> semesterList = new ArrayList<Semester>();
	static ArrayList<Student> studentList = new ArrayList<Student>();
	@BeforeClass
	public static void setup() throws PersonException
	{
        try
        {
        	Course beginningCourse = new Course(UUID.randomUUID(), "Course1", 99, eMajor.BUSINESS);
        Course middleCourse = new Course(UUID.randomUUID(), "Course2", 100, eMajor.NURSING);
        Course finalCourse = new Course(UUID.randomUUID(), "Course3", 98, eMajor.COMPSI);
        courseList.add(beginningCourse);
        courseList.add(middleCourse);
        courseList.add(finalCourse);
       
        
        Semester fallSemester = new Semester(UUID.randomUUID(), new Date(2017, 8, 31), new Date(2017, 12, 15));
        Semester springSemester = new Semester(UUID.randomUUID(), new Date(2018, 2, 4), new Date(2018, 5, 24));
        semesterList.add(fallSemester);
        semesterList.add(springSemester);
       
        
        Section section1 = new Section(beginningCourse.getCourseID(), fallSemester.getSemesterID(), UUID.randomUUID(), 001);
        Section section2 = new Section(beginningCourse.getCourseID(), springSemester.getSemesterID(), UUID.randomUUID(), 002);
        Section section3 = new Section(middleCourse.getCourseID(), fallSemester.getSemesterID(), UUID.randomUUID(), 333);
        Section section4 = new Section(middleCourse.getCourseID(), springSemester.getSemesterID(), UUID.randomUUID(), 004);
        Section section5 = new Section(finalCourse.getCourseID(), fallSemester.getSemesterID(), UUID.randomUUID(), 005);
        Section section6 = new Section(finalCourse.getCourseID(), springSemester.getSemesterID(), UUID.randomUUID(), 600);
        sectionList.add(section1);
        sectionList.add(section2);
        sectionList.add(section3);
        sectionList.add(section4);
        sectionList.add(section5);
        sectionList.add(section6);
       
        
        Student student1 = new Student("Jason", "Harper", "Johnson", new Date(1999,4,1), eMajor.NURSING,  "726 Broad Street Philadelphia Pennsylvania 93847", "267-644-7296", "jjohnson@udel.edu");
        Student student2 = new Student("Jason", "Harper", "Johnson", new Date(1999,4,1), eMajor.NURSING,  "726 Broad Street Philadelphia Pennsylvania 93847", "267-644-7296", "jjohnson@udel.edu");
        Student student3 = new Student("Jason", "Harper", "Johnson", new Date(1999,4,1), eMajor.NURSING,  "726 Broad Street Philadelphia Pennsylvania 93847", "267-644-7296", "jjohnson@udel.edu");
        Student student4 = new Student("Jason", "Harper", "Johnson", new Date(1999,4,1), eMajor.NURSING,  "726 Broad Street Philadelphia Pennsylvania 93847", "267-644-7296", "jjohnson@udel.edu");
        Student student5 = new Student("Jason", "Harper", "Johnson", new Date(1999,4,1), eMajor.NURSING,  "726 Broad Street Philadelphia Pennsylvania 93847", "267-644-7296", "jjohnson@udel.edu");
        Student student6 = new Student("Jason", "Harper", "Johnson", new Date(1999,4,1), eMajor.NURSING,  "726 Broad Street Philadelphia Pennsylvania 93847", "267-644-7296", "jjohnson@udel.edu");
        Student student7 = new Student("Jason", "Harper", "Johnson", new Date(1999,4,1), eMajor.NURSING,  "726 Broad Street Philadelphia Pennsylvania 93847", "267-644-7296", "jjohnson@udel.edu");
        Student student8 = new Student("Jason", "Harper", "Johnson", new Date(1999,4,1), eMajor.NURSING,  "726 Broad Street Philadelphia Pennsylvania 93847", "267-644-7296", "jjohnson@udel.edu");
        Student student9 = new Student("Jason", "Harper", "Johnson", new Date(1999,4,1), eMajor.NURSING,  "726 Broad Street Philadelphia Pennsylvania 93847", "267-644-7296", "jjohnson@udel.edu");
        Student student10 = new Student("Jason", "Harper", "Johnson", new Date(1999,4,1), eMajor.NURSING,  "726 Broad Street Philadelphia Pennsylvania 93847", "267-644-7296", "jjohnson@udel.edu");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);
       
        Enrollment section1Student1Enrollment = new Enrollment(section1.getSectionID(), student1.getStudentID());
        Enrollment section1Student2Enrollment = new Enrollment(section1.getSectionID(), student2.getStudentID());
        Enrollment section1Student3Enrollment = new Enrollment(section1.getSectionID(), student3.getStudentID());
        Enrollment section1Student4Enrollment = new Enrollment(section1.getSectionID(), student4.getStudentID());
        Enrollment section1Student5Enrollment = new Enrollment(section1.getSectionID(), student5.getStudentID());
        Enrollment section1Student6Enrollment = new Enrollment(section1.getSectionID(), student6.getStudentID());
        Enrollment section1Student7Enrollment = new Enrollment(section1.getSectionID(), student7.getStudentID());
        Enrollment section1Student8Enrollment = new Enrollment(section1.getSectionID(), student8.getStudentID());
        Enrollment section1Student9Enrollment = new Enrollment(section1.getSectionID(), student9.getStudentID());
        Enrollment section1Student10Enrollment = new Enrollment(section1.getSectionID(), student10.getStudentID());
        section1Student1Enrollment.setGrade(100.00);
        section1Student2Enrollment.setGrade(99.00);
        section1Student3Enrollment.setGrade(98.00);
        section1Student4Enrollment.setGrade(97.00);
        section1Student5Enrollment.setGrade(96.00);
        section1Student6Enrollment.setGrade(95.00);
        section1Student7Enrollment.setGrade(94.00);
        section1Student8Enrollment.setGrade(93.00);
        section1Student9Enrollment.setGrade(92.00);
        section1Student10Enrollment.setGrade(91.00);
       
        Enrollment section2Student1Enrollment = new Enrollment(section2.getSectionID(), student1.getStudentID());
        Enrollment section2Student2Enrollment = new Enrollment(section2.getSectionID(), student2.getStudentID());
        Enrollment section2Student3Enrollment = new Enrollment(section2.getSectionID(), student3.getStudentID());
        Enrollment section2Student4Enrollment = new Enrollment(section2.getSectionID(), student4.getStudentID());
        Enrollment section2Student5Enrollment = new Enrollment(section2.getSectionID(), student5.getStudentID());
        Enrollment section2Student6Enrollment = new Enrollment(section2.getSectionID(), student6.getStudentID());
        Enrollment section2Student7Enrollment = new Enrollment(section2.getSectionID(), student7.getStudentID());
        Enrollment section2Student8Enrollment = new Enrollment(section2.getSectionID(), student8.getStudentID());
        Enrollment section2Student9Enrollment = new Enrollment(section2.getSectionID(), student9.getStudentID());
        Enrollment section2Student10Enrollment = new Enrollment(section2.getSectionID(), student10.getStudentID());
        section2Student1Enrollment.setGrade(91.00);
        section2Student2Enrollment.setGrade(100.00);
        section2Student3Enrollment.setGrade(99.00);
        section2Student4Enrollment.setGrade(98.00);
        section2Student5Enrollment.setGrade(97.00);
        section2Student6Enrollment.setGrade(96.00);
        section2Student7Enrollment.setGrade(95.00);
        section2Student8Enrollment.setGrade(94.00);
        section2Student9Enrollment.setGrade(93.00);
        section2Student10Enrollment.setGrade(92.00);
       
        Enrollment section3Student1Enrollment = new Enrollment(section3.getSectionID(), student1.getStudentID());
        Enrollment section3Student2Enrollment = new Enrollment(section3.getSectionID(), student2.getStudentID());
        Enrollment section3Student3Enrollment = new Enrollment(section3.getSectionID(), student3.getStudentID());
        Enrollment section3Student4Enrollment = new Enrollment(section3.getSectionID(), student4.getStudentID());
        Enrollment section3Student5Enrollment = new Enrollment(section3.getSectionID(), student5.getStudentID());
        Enrollment section3Student6Enrollment = new Enrollment(section3.getSectionID(), student6.getStudentID());
        Enrollment section3Student7Enrollment = new Enrollment(section3.getSectionID(), student7.getStudentID());
        Enrollment section3Student8Enrollment = new Enrollment(section3.getSectionID(), student8.getStudentID());
        Enrollment section3Student9Enrollment = new Enrollment(section3.getSectionID(), student9.getStudentID());
        Enrollment section3Student10Enrollment = new Enrollment(section3.getSectionID(), student10.getStudentID());
        section3Student1Enrollment.setGrade(92.00);
        section3Student2Enrollment.setGrade(91.00);
        section3Student3Enrollment.setGrade(100.00);
        section3Student4Enrollment.setGrade(99.00);
        section3Student5Enrollment.setGrade(98.00);
        section3Student6Enrollment.setGrade(97.00);
        section3Student7Enrollment.setGrade(96.00);
        section3Student8Enrollment.setGrade(95.00);
        section3Student9Enrollment.setGrade(94.00);
        section3Student10Enrollment.setGrade(93.00);
       
        Enrollment section4Student1Enrollment = new Enrollment(section3.getSectionID(), student1.getStudentID());
        Enrollment section4Student2Enrollment = new Enrollment(section3.getSectionID(), student2.getStudentID());
        Enrollment section4Student3Enrollment = new Enrollment(section3.getSectionID(), student3.getStudentID());
        Enrollment section4Student4Enrollment = new Enrollment(section3.getSectionID(), student4.getStudentID());
        Enrollment section4Student5Enrollment = new Enrollment(section3.getSectionID(), student5.getStudentID());
        Enrollment section4Student6Enrollment = new Enrollment(section3.getSectionID(), student6.getStudentID());
        Enrollment section4Student7Enrollment = new Enrollment(section3.getSectionID(), student7.getStudentID());
        Enrollment section4Student8Enrollment = new Enrollment(section3.getSectionID(), student8.getStudentID());
        Enrollment section4Student9Enrollment = new Enrollment(section3.getSectionID(), student9.getStudentID());
        Enrollment section4Student10Enrollment = new Enrollment(section3.getSectionID(), student10.getStudentID());
        section4Student1Enrollment.setGrade(93.00);
        section4Student2Enrollment.setGrade(92.00);
        section4Student3Enrollment.setGrade(91.00);
        section4Student4Enrollment.setGrade(100.00);
        section4Student5Enrollment.setGrade(99.00);
        section4Student6Enrollment.setGrade(98.00);
        section4Student7Enrollment.setGrade(97.00);
        section4Student8Enrollment.setGrade(96.00);
        section4Student9Enrollment.setGrade(95.00);
        section4Student10Enrollment.setGrade(94.00);
       
        Enrollment section5Student1Enrollment = new Enrollment(section3.getSectionID(), student1.getStudentID());
        Enrollment section5Student2Enrollment = new Enrollment(section3.getSectionID(), student2.getStudentID());
        Enrollment section5Student3Enrollment = new Enrollment(section3.getSectionID(), student3.getStudentID());
        Enrollment section5Student4Enrollment = new Enrollment(section3.getSectionID(), student4.getStudentID());
        Enrollment section5Student5Enrollment = new Enrollment(section3.getSectionID(), student5.getStudentID());
        Enrollment section5Student6Enrollment = new Enrollment(section3.getSectionID(), student6.getStudentID());
        Enrollment section5Student7Enrollment = new Enrollment(section3.getSectionID(), student7.getStudentID());
        Enrollment section5Student8Enrollment = new Enrollment(section3.getSectionID(), student8.getStudentID());
        Enrollment section5Student9Enrollment = new Enrollment(section3.getSectionID(), student9.getStudentID());
        Enrollment section5Student10Enrollment = new Enrollment(section3.getSectionID(), student10.getStudentID());
        section5Student1Enrollment.setGrade(94.00);
        section5Student2Enrollment.setGrade(93.00);
        section5Student3Enrollment.setGrade(92.00);
        section5Student4Enrollment.setGrade(91.00);
        section5Student5Enrollment.setGrade(100.00);
        section5Student6Enrollment.setGrade(99.00);
        section5Student7Enrollment.setGrade(98.00);
        section5Student8Enrollment.setGrade(97.00);
        section5Student9Enrollment.setGrade(96.00);
        section5Student10Enrollment.setGrade(95.00);
       
        Enrollment section6Student1Enrollment = new Enrollment(section3.getSectionID(), student1.getStudentID());
        Enrollment section6Student2Enrollment = new Enrollment(section3.getSectionID(), student2.getStudentID());
        Enrollment section6Student3Enrollment = new Enrollment(section3.getSectionID(), student3.getStudentID());
        Enrollment section6Student4Enrollment = new Enrollment(section3.getSectionID(), student4.getStudentID());
        Enrollment section6Student5Enrollment = new Enrollment(section3.getSectionID(), student5.getStudentID());
        Enrollment section6Student6Enrollment = new Enrollment(section3.getSectionID(), student6.getStudentID());
        Enrollment section6Student7Enrollment = new Enrollment(section3.getSectionID(), student7.getStudentID());
        Enrollment section6Student8Enrollment = new Enrollment(section3.getSectionID(), student8.getStudentID());
        Enrollment section6Student9Enrollment = new Enrollment(section3.getSectionID(), student9.getStudentID());
        Enrollment section6Student10Enrollment = new Enrollment(section3.getSectionID(), student10.getStudentID());
        section6Student1Enrollment.setGrade(95.00);
        section6Student2Enrollment.setGrade(94.00);
        section6Student3Enrollment.setGrade(93.00);
        section6Student4Enrollment.setGrade(92.00);
        section6Student5Enrollment.setGrade(91.00);
        section6Student6Enrollment.setGrade(100.00);
        section6Student7Enrollment.setGrade(99.00);
        section6Student8Enrollment.setGrade(98.00);
        section6Student9Enrollment.setGrade(97.00);
        section6Student10Enrollment.setGrade(96.00);
        
        
        enrollmentList.add(section1Student1Enrollment);
        enrollmentList.add(section1Student2Enrollment);
        enrollmentList.add(section1Student3Enrollment);
        enrollmentList.add(section1Student4Enrollment);
        enrollmentList.add(section1Student5Enrollment);
        enrollmentList.add(section1Student6Enrollment);
        enrollmentList.add(section1Student7Enrollment);
        enrollmentList.add(section1Student8Enrollment);
        enrollmentList.add(section1Student9Enrollment);
        enrollmentList.add(section1Student10Enrollment);
        enrollmentList.add(section2Student1Enrollment);
        enrollmentList.add(section2Student2Enrollment);
        enrollmentList.add(section2Student3Enrollment);
        enrollmentList.add(section2Student4Enrollment);
        enrollmentList.add(section2Student5Enrollment);
        enrollmentList.add(section2Student6Enrollment);
        enrollmentList.add(section2Student7Enrollment);
        enrollmentList.add(section2Student8Enrollment);
        enrollmentList.add(section2Student9Enrollment);
        enrollmentList.add(section2Student10Enrollment);
        enrollmentList.add(section3Student1Enrollment);
        enrollmentList.add(section3Student2Enrollment);
        enrollmentList.add(section3Student3Enrollment);
        enrollmentList.add(section3Student4Enrollment);
        enrollmentList.add(section3Student5Enrollment);
        enrollmentList.add(section3Student6Enrollment);
        enrollmentList.add(section3Student7Enrollment);
        enrollmentList.add(section3Student8Enrollment);
        enrollmentList.add(section3Student9Enrollment);
        enrollmentList.add(section3Student10Enrollment);
        enrollmentList.add(section4Student1Enrollment);
        enrollmentList.add(section4Student2Enrollment);
        enrollmentList.add(section4Student3Enrollment);
        enrollmentList.add(section4Student4Enrollment);
        enrollmentList.add(section4Student5Enrollment);
        enrollmentList.add(section4Student6Enrollment);
        enrollmentList.add(section4Student7Enrollment);
        enrollmentList.add(section4Student8Enrollment);
        enrollmentList.add(section4Student9Enrollment);
        enrollmentList.add(section4Student10Enrollment);
        enrollmentList.add(section5Student1Enrollment);
        enrollmentList.add(section5Student2Enrollment);
        enrollmentList.add(section5Student3Enrollment);
        enrollmentList.add(section5Student4Enrollment);
        enrollmentList.add(section5Student5Enrollment);
        enrollmentList.add(section5Student6Enrollment);
        enrollmentList.add(section5Student7Enrollment);
        enrollmentList.add(section5Student8Enrollment);
        enrollmentList.add(section5Student9Enrollment);
        enrollmentList.add(section5Student10Enrollment);
        enrollmentList.add(section6Student1Enrollment);
        enrollmentList.add(section6Student2Enrollment);
        enrollmentList.add(section6Student3Enrollment);
        enrollmentList.add(section6Student4Enrollment);
        enrollmentList.add(section6Student5Enrollment);
        enrollmentList.add(section6Student6Enrollment);
        enrollmentList.add(section6Student7Enrollment);
        enrollmentList.add(section6Student8Enrollment);
        enrollmentList.add(section6Student9Enrollment);
        enrollmentList.add(section6Student10Enrollment);
        }
        catch(PersonException e) 
        {
        		e.printStackTrace();
        }
	}

	@Test
    public void testStudent1GPA() 
	{
       
        double GPAStudent1 = ((enrollmentList.get(0).getGrade() + enrollmentList.get(10).getGrade() + enrollmentList.get(20).getGrade()
                + enrollmentList.get(30).getGrade() + enrollmentList.get(40).getGrade() + enrollmentList.get(50).getGrade())/100/6)*4;
        assertEquals(GPAStudent1, 3.76, .01);
    }
	@Test
    public void testStudent2GPA() 
	{
       
        double GPAStudent2 = ((enrollmentList.get(1).getGrade() + enrollmentList.get(11).getGrade() + enrollmentList.get(21).getGrade()
                + enrollmentList.get(31).getGrade() + enrollmentList.get(41).getGrade() + enrollmentList.get(51).getGrade())/100/6)*4;
        assertEquals(GPAStudent2, 3.79, .01);
    }
	@Test
    public void testStudent3GPA() 
	{
       
        double GPAStudent3 = ((enrollmentList.get(2).getGrade() + enrollmentList.get(12).getGrade() + enrollmentList.get(22).getGrade()
                + enrollmentList.get(32).getGrade() + enrollmentList.get(42).getGrade() + enrollmentList.get(52).getGrade())/100/6)*4;
        assertEquals(GPAStudent3, 3.82, .01);
    }
	@Test
    public void testStudent4GPA() 
	{
       
        double GPAStudent4 = ((enrollmentList.get(3).getGrade() + enrollmentList.get(13).getGrade() + enrollmentList.get(23).getGrade()
                + enrollmentList.get(33).getGrade() + enrollmentList.get(43).getGrade() + enrollmentList.get(53).getGrade())/100/6)*4;
        assertEquals(GPAStudent4, 3.84, .01);
    }
	@Test
    public void testStudent5GPA() 
	{
       
        double GPAStudent5 = ((enrollmentList.get(4).getGrade() + enrollmentList.get(14).getGrade() + enrollmentList.get(24).getGrade()
                + enrollmentList.get(34).getGrade() + enrollmentList.get(44).getGrade() + enrollmentList.get(54).getGrade())/100/6)*4;
        assertEquals(GPAStudent5, 3.87, .01);
    }
	@Test
    public void testStudent6GPA() 
	{
       
        double GPAStudent6 = ((enrollmentList.get(5).getGrade() + enrollmentList.get(15).getGrade() + enrollmentList.get(25).getGrade()
                + enrollmentList.get(35).getGrade() + enrollmentList.get(45).getGrade() + enrollmentList.get(55).getGrade())/100/6)*4;
        assertEquals(GPAStudent6, 3.90, .01);
    }
	@Test
    public void testStudent7GPA() 
	{
       
        double GPAStudent7 = ((enrollmentList.get(6).getGrade() + enrollmentList.get(16).getGrade() + enrollmentList.get(26).getGrade()
                + enrollmentList.get(36).getGrade() + enrollmentList.get(46).getGrade() + enrollmentList.get(56).getGrade())/100/6)*4;
        assertEquals(GPAStudent7, 3.86, .01);
    }
	@Test
    public void testStudent8GPA() 
	{
       
        double GPAStudent8 = ((enrollmentList.get(7).getGrade() + enrollmentList.get(17).getGrade() + enrollmentList.get(27).getGrade()
                + enrollmentList.get(37).getGrade() + enrollmentList.get(47).getGrade() + enrollmentList.get(57).getGrade())/100/6)*4;
        assertEquals(GPAStudent8, 3.82, .01);
    }
	@Test
    public void testStudent9GPA() 
	{
       
        double GPAStudent9 = ((enrollmentList.get(8).getGrade() + enrollmentList.get(18).getGrade() + enrollmentList.get(28).getGrade()
                + enrollmentList.get(38).getGrade() + enrollmentList.get(48).getGrade() + enrollmentList.get(58).getGrade())/100/6)*4;
        assertEquals(GPAStudent9, 3.78, .01);
    }
	@Test
    public void testStudent10GPA() 
	{
       
        double GPAStudent10 = ((enrollmentList.get(9).getGrade() + enrollmentList.get(19).getGrade() + enrollmentList.get(29).getGrade()
                + enrollmentList.get(39).getGrade() + enrollmentList.get(49).getGrade() + enrollmentList.get(59).getGrade())/100/6)*4;
        assertEquals(GPAStudent10, 3.74, .01);
    }
	@Test
    public void testBusinessClassAverageGrade() 
	{
        int classAverageBusiness = (int) (enrollmentList.get(0).getGrade() + enrollmentList.get(1).getGrade() + enrollmentList.get(2).getGrade() +
                enrollmentList.get(3).getGrade() + enrollmentList.get(4).getGrade() + enrollmentList.get(5).getGrade() +
                enrollmentList.get(6).getGrade() + enrollmentList.get(7).getGrade() + enrollmentList.get(8).getGrade() +
                enrollmentList.get(9).getGrade() + enrollmentList.get(10).getGrade() + enrollmentList.get(11).getGrade() + enrollmentList.get(12).getGrade() +
                enrollmentList.get(13).getGrade() + enrollmentList.get(14).getGrade() + enrollmentList.get(15).getGrade() +
                enrollmentList.get(16).getGrade() + enrollmentList.get(17).getGrade() + enrollmentList.get(18).getGrade() +
                enrollmentList.get(19).getGrade());
        	classAverageBusiness = classAverageBusiness/20;
        assertEquals(classAverageBusiness, 95);
    }
	@Test
    public void testNursingClassAverageGrade() 
	{
        int classAverageNursing = (int) (enrollmentList.get(20).getGrade() + enrollmentList.get(21).getGrade() + enrollmentList.get(22).getGrade() +
                enrollmentList.get(23).getGrade() + enrollmentList.get(24).getGrade() + enrollmentList.get(25).getGrade() +
                enrollmentList.get(26).getGrade() + enrollmentList.get(27).getGrade() + enrollmentList.get(28).getGrade() +
                enrollmentList.get(29).getGrade() + enrollmentList.get(30).getGrade() + enrollmentList.get(31).getGrade() + enrollmentList.get(32).getGrade() +
                enrollmentList.get(33).getGrade() + enrollmentList.get(34).getGrade() + enrollmentList.get(35).getGrade() +
                enrollmentList.get(36).getGrade() + enrollmentList.get(37).getGrade() + enrollmentList.get(38).getGrade() +
                enrollmentList.get(39).getGrade());
        	classAverageNursing = classAverageNursing/20;
        assertEquals(classAverageNursing, 95);
    }
	@Test
    public void testCOMPSIClassAverageGrade() 
	{
        int classAverageCOMPSI = (int) (enrollmentList.get(40).getGrade() + enrollmentList.get(41).getGrade() + enrollmentList.get(42).getGrade() +
                enrollmentList.get(43).getGrade() + enrollmentList.get(44).getGrade() + enrollmentList.get(45).getGrade() +
                enrollmentList.get(46).getGrade() + enrollmentList.get(47).getGrade() + enrollmentList.get(48).getGrade() +
                enrollmentList.get(49).getGrade() + enrollmentList.get(50).getGrade() + enrollmentList.get(51).getGrade() + enrollmentList.get(52).getGrade() +
                enrollmentList.get(53).getGrade() + enrollmentList.get(54).getGrade() + enrollmentList.get(55).getGrade() +
                enrollmentList.get(56).getGrade() + enrollmentList.get(57).getGrade() + enrollmentList.get(58).getGrade() +
                enrollmentList.get(59).getGrade());
        	classAverageCOMPSI = classAverageCOMPSI/20;
        assertEquals(classAverageCOMPSI, 95);
    }
}