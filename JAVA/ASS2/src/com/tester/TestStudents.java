package com.tester;

import java.util.Scanner;

import com.cdac.core.*;

public class TestStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] st = new Student[2];
		
		String name,email;
		int age;
		double test_m,ass_m,quiz_m;
		double gpa0,gpa1;
		
		System.out.println("Enter the details of Student 1-----");
		System.out.println("Enter the name of Student 1");
		name=sc.next();
		System.out.println("Enter the email of Student 1");
		email=sc.next();
		System.out.println("Enter the age of Student 1");
		age=sc.nextInt();
		st[0] = new Student(name,email,age);
		
		System.out.println("Enter marks for Student 1");
		System.out.println("Enter marks for test");
		test_m = sc.nextDouble();
		st[0].setTest_marks(test_m);
		System.out.println("Enter marks for assignments");
		ass_m = sc.nextDouble();
		st[0].setAss_marks(ass_m);
		System.out.println("Enter marks for quiz");
		quiz_m = sc.nextDouble();
		st[0].setQuiz_marks(quiz_m);
		gpa0 = st[0].computeGPA();
		
		System.out.println("Enter the details of Student 2-----");
		System.out.println("Enter the name of Student 2");
		name=sc.next();
		System.out.println("Enter the email of Student 2");
		email=sc.next();
		System.out.println("Enter the age of Student 2");
		age=sc.nextInt();
		st[1] = new Student(name,email,age);

		System.out.println("Enter marks for Student 2");
		System.out.println("Enter marks for test");
		test_m = sc.nextDouble();
		st[1].setTest_marks(test_m);
		System.out.println("Enter marks for assignments");
		ass_m = sc.nextDouble();
		st[1].setAss_marks(ass_m);
		System.out.println("Enter marks for quiz");
		quiz_m = sc.nextDouble();
		st[1].setQuiz_marks(quiz_m);
		gpa1 = st[1].computeGPA();
		
		System.out.println("Marks of std1-" + gpa0);
		System.out.println("Marks of std2-" + gpa1);
		
		if (st[1].getGpa() > st[0].getGpa()) {
			System.out.println("Student 2 has more marks");
		}
		else {
			System.out.println("Student 1 has more marks");
		}
		
		if (sc!=null) {
			sc.close();
		}
		
	}

}
