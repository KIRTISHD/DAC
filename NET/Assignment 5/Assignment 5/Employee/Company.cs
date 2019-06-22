using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_5.Employee
{
    class Company
    {
        private string CompanyName;
        private string CompanyAddress;
        private List<Employee> emp = new List<Employee>();

        public Company(string companyName, string companyAddress)
        {
            CompanyName = companyName;
            CompanyAddress = companyAddress;
        }

        public string PCompanyName { get { return this.CompanyName; } set { this.CompanyName = value; } }
        public string PCompanyAddress { get { return this.CompanyAddress; } set { this.CompanyAddress = value; } }

        public bool AddEmployee(Employee e1)
        {
            this.emp.Add(e1);
            return true;
        }

        public Employee SearchEmployee(int empno)
        {
            foreach(Employee e in this.emp)
            {
                if (e.PEmployeeID == empno)
                {
                    return e;
                }
            }
            return null;
        }

        public bool RemoveEmployee(int empno)
        {
            foreach(Employee e in this.emp)
            {
                if (e.PEmployeeID == empno)
                {
                    this.emp.Remove(e);
                    return true;
                }
            }
            return false;
        }

        public void ShowEmployees()
        {
            foreach (Employee e in this.emp)
            {
                Console.WriteLine(e);
            }
        }
    }
}
