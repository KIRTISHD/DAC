using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_5.Employee
{
    class Employee
    {
        private static int counter = 1;
        private int EmployeeID;
        private string EmployeeName;
        private string EmployeeCity;

        public Employee() { }

        public Employee( string employeeName, string employeeCity)
        {
            EmployeeID = counter++;
            EmployeeName = employeeName;
            EmployeeCity = employeeCity;
        }

        public int PEmployeeID { get { return this.EmployeeID; } }
        public string PEmployeeName { get { return this.EmployeeName; } set { this.EmployeeName = value; } }
        public string PEmployeeCity { get { return this.EmployeeCity; } set { this.EmployeeCity = value; } }

        public void RequestLeave(string Reason)
        {
            Console.WriteLine(this.EmployeeName + " wants leave for reason- " + Reason);
        }

        public override string ToString()
        {
            return "EMP ID-" + this.PEmployeeID + ", EMP NAME-" + this.PEmployeeName + ", EMP City-" + this.PEmployeeCity;
        }
    }
}
