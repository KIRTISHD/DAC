package src.com.cdac.core;

public class Q{
    private static int int_gen=1;
    private int id;
    private String name;
    private String email;
    private int age;
    private double gpa;
    private int quiz_marks;
    private int test_marks;
    private int ass_marks;

    public Q(String name,String email,int age){
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

    public String getDetails(){
        return "Details are- id="+id+" name - "+name+" email-"+email+" age-"+age+" gpa-"+gpa;
    }

    public void takeInput( int quiz,int test,int ass){
        this.ass_marks=ass;
        this.quiz_marks=quiz;
        this.test_marks=test;
    }

    public double computeGPA(){
        double passs=(quiz_marks+quiz_marks*0.2)+(test_marks+test_marks*0.5)+(ass_marks+ass_marks*0.3);
        return 0;
    }
}
