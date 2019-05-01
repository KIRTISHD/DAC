package com.cdac.core;

public class Student{
    public String getDob() {
		return dob;
	}

	public String getSubject() {
		return subject;
	}

	private int rollno;
    private String subject;
    private String email;
    private String dob;
    private double gpa;

    public Student(int rollno, String email, String dob, String subject, double gpa) {
        this.rollno=rollno;
        this.email=email;
        this.dob=dob;
        this.subject=subject;
        this.gpa=gpa;
	}

	public String toString(){
        return "Details are- rollno="+rollno+" subject - "+subject+" email-"+email+" dob-"+dob+" gpa-"+gpa;
    }
 /*
    public void takeInput( int quiz,int test,int ass){
        this.ass_marks=ass;
        this.quiz_marks=quiz;
        this.test_marks=test;
    }
*/

	public double getGpa() {
		return gpa;
	}
}