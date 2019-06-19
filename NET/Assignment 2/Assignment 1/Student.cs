using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_1
{
    public class Student
    {
        private int StudentID;
        private string StudentName;
        private DateTime StudentDOB;
        private String StudentCity;

        public Student(int StudentID, string StudentName, DateTime StudentDOB, String StudentCity)
        {
            this.StudentID = StudentID;
            this.StudentName = StudentName;
            this.StudentDOB = StudentDOB;
            this.StudentCity = StudentCity;
        }

        public void getDetails()
        {
            Console.WriteLine("Student id is-" + StudentID);
            Console.WriteLine("Student name is-" + StudentName);
            Console.WriteLine("Student DOB is-" + StudentDOB.Date);
            Console.WriteLine("Student City is-" + StudentCity);
        }

        public void GetAge()
        {
            DateTime today = DateTime.Now;
            Console.WriteLine("Age is -"+today.CompareTo(StudentDOB));
        }
    }

    class StudentCall
    {
        public static void Main(String[] ss)
        {
            Student st = new Student(10,"Kirtya",Convert.ToDateTime("10/10/1994"),"PUNE");
            st.GetAge();
            st.getDetails();
            Console.ReadKey();

        }
    }
}
