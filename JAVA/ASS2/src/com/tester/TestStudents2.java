package com.tester;

import java.util.Scanner;

import com.cdac.core.*;

public class TestStudents2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count,counter=0,choice;
		String name,email;
		int age;
		double test_m,ass_m,quiz_m;
		double gpa;
		int it;
		
		System.out.println("Enter the number of students you want");
		count= sc.nextInt();

		Student[] st = new Student[count];
		
		boolean loop = true;
		while(loop) {
			System.out.println("Kya karna hai Sarkar-");
			System.out.println("1. Add Student");
			System.out.println("2. Display All Students");
			System.out.println("3. Calculate Highest GPA");
			choice=sc.nextInt();
			switch(choice) {
				case 1:
					if (counter!=count) {
						System.out.printf("Enter the details of Student %d-----\n",counter+1);
						System.out.printf("Enter the name of Student %d\n",counter+1);
						name=sc.next();
						System.out.printf("Enter the email of Student %d\n",counter+1);
						email=sc.next();
						System.out.printf("Enter the age of Student %d\n",counter+1);
						age=sc.nextInt();
						st[counter] = new Student(name,email,age);
						
						System.out.printf("Enter marks for Student %d\n",counter+1);
						System.out.println("Enter marks for test");
						test_m = sc.nextDouble();
						st[counter].setTest_marks(test_m);
						System.out.println("Enter marks for assignments");
						ass_m = sc.nextDouble();
						st[counter].setAss_marks(ass_m);
						System.out.println("Enter marks for quiz");
						quiz_m = sc.nextDouble();
						st[counter].setQuiz_marks(quiz_m);
						gpa = st[counter].computeGPA();
						System.out.println("His GPA is"+ st[counter++].getGpa());
					}
					else {
						System.out.println("Cannot enter more students");
					}
					break;
				case 2:
					for (int i = 0; i < counter; i++) {
						System.out.println(st[i]);
						System.out.println("His GPA is"+ st[i].getGpa());
					}
					break;
				case 3:
					gpa=st[0].getGpa();
					it=0;
					for (int i = 1; i < counter; i++) {
						if (gpa < st[i].getGpa()) {
							gpa=st[i].getGpa();
							it=i;
						}
					}
					System.out.printf("Highest GPA guy is-%d",it+1);
					System.out.println(st[it]);
					//System.out.println("His gpa is-"+st[it].getGpa());
					break;
				default:
					System.out.println("Default");
					loop=false;
			}
		}
		
		
		if (sc!=null) {
			sc.close();
		}
		
	}

}
