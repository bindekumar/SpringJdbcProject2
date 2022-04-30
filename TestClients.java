package com.binde.core.jdbc;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClients {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("TestCfg.xml");
		StudentDea std = (StudentDea) context.getBean("studentDea");
		// Scanner sc=new Scanner(System.in);
		// System.out.println("Enter Deleted Row:");
		// Integer num=sc.nextInt();
		// Student st=new Student();
       //st.setId(107);
       //st.setName("BINDE KUMARiiii");
       //st.setCity("BIHAR");
		// Integer rs=std.addRecord(st);
        //Integer rs=std.updateRecord(st);
        //if(rs!=0) {
        //System.out.println("AddRecord:"+rs);
       //System.out.println("UPDATE RECORD..");
        //       }
       //	
       //Delete Operation
       // st.setId(num);
      // Integer rs=std.deleteRecord(st);
      // if(rs!=0)
     // System.out.println("Delete Record..");
     // else
      // System.out.println("No Record Match..");

		// Single Selected Variable
		// Student student = std.getStudent(106);
		// System.out.println(student);
		
		
		//Multiple Row
		
		List<Student> student=std.getAllStudent();
		Iterator<Student> i=student.iterator();
		while(i.hasNext()==true)
		{
			Student name=i.next();
			System.out.println(name);
		}

	}

}
