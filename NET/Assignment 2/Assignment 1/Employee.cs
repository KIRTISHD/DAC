using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_1
{
    public class Employee
    {
        private int EmployeeID;
        private string EmployeeName;
        private DateTime EmployeeDOJ;
        private double EmployeeBasicSalary;

        public Employee(int EmployeeID, string EmployeeName, DateTime EmployeeDOJ, double EmployeeBasicSalary)
        {
            this.EmployeeID = EmployeeID;
            this.EmployeeName = EmployeeName;
            this.EmployeeDOJ = EmployeeDOJ;
            this.EmployeeBasicSalary = EmployeeBasicSalary;
        }

        public void getDetails()
        {
            Console.WriteLine("Employee id is->" + EmployeeID);
            Console.WriteLine("Employee name is->" + EmployeeName);
            Console.WriteLine("Employee DOJ is->" + EmployeeDOJ);
            Console.WriteLine("Employee Basic Salary is->" + EmployeeBasicSalary);
        }

        public void GetExperience()
        {
            DateTime today = DateTime.Now;
            TimeSpan st = today - EmployeeDOJ;
            Console.WriteLine("Experience is ->" + st.Days);
        }

        public void GetSalary()
        {
            Console.WriteLine("Employee Basic Salary is-" + EmployeeBasicSalary);
        }
    }

    class EmployeeCall
    {
       /* public static void Main(String[] ss)
        {
            Employee e1 = new Employee(10,"NITYA",Convert.ToDateTime("10/10/1992"),90000);
            e1.getDetails();
            e1.GetExperience();
            e1.GetSalary();
            Console.ReadKey();
        } */
    }
}

