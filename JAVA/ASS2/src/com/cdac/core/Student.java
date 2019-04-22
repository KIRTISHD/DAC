package com.cdac.core;

public class Student{
    private static int int_gen=1;
    private int id;
    private String name;
    private String email;
    private int age;
    private double gpa;
    private double quiz_marks;
    private double test_marks;
    private double ass_marks;

    public Student(String name,String email,int age){
        id=int_gen;
        this.name=name;
        this.email=email;
        this.age=age;
        gpa=0;
        ass_marks=0;
        test_marks=0;
        quiz_marks=0;
        int_gen++;
    }

    public String toString(){
        return "Details are- id="+id+" name - "+name+" email-"+email+" age-"+age+" gpa-"+gpa;
    }
 /*
    public void takeInput( int quiz,int test,int ass){
        this.ass_marks=ass;
        this.quiz_marks=quiz;
        this.test_marks=test;
    }
*/
    public double computeGPA(){
        double marks=(quiz_marks*0.2)+(test_marks*0.5)+(ass_marks*0.3);
        gpa=marks;
        return marks;
    }

	public void setQuiz_marks(double quiz_marks) {
		this.quiz_marks = quiz_marks;
	}

	public void setTest_marks(double test_marks) {
		this.test_marks = test_marks;
	}

	public void setAss_marks(double ass_marks) {
		this.ass_marks = ass_marks;
	}

	public double getGpa() {
		return gpa;
	}
}
