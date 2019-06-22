using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_5.Employee
{
    class CompanyMain
    {
        /*
        public static void Main(string [] ss)
        {
            Company cp = new Company("Santa Banta Corp.", "Yawatmal");
            Employee e = null;
            string empname,empcity;
            int choice,empid;
            bool loop = true;
            bool result;
            while(loop)
            {
                Console.WriteLine("Select your choice");
                Console.WriteLine("1. Add Employee");
                Console.WriteLine("2. Search Employee");
                Console.WriteLine("3. Remove Employee");
                Console.WriteLine("4. List Employees");
                choice = Convert.ToInt32(Console.ReadLine());
                switch (choice)
                {
                    case 1:
                        Console.WriteLine("Enter Employee name");
                        empname = Console.ReadLine();
                        Console.WriteLine("Enter Employee's City");
                        empcity = Console.ReadLine();
                        e = new Employee(empname, empcity);
                        cp.AddEmployee(e);
                        break;
                    case 2:
                        Console.WriteLine("Enter Employee id you want to search");
                        empid = Convert.ToInt32(Console.ReadLine());
                        e = cp.SearchEmployee(empid);
                        if (e == null)
                        {
                            Console.WriteLine("No employee with Employee id {0} found", empid);
                        }
                        else
                        {
                            Console.WriteLine(e);
                        }
                        break;
                    case 3:
                        Console.WriteLine("Enter Employee id you want to remove");
                        empid = Convert.ToInt32(Console.ReadLine());
                        result = cp.RemoveEmployee(empid);
                        if (result == false)
                        {
                            Console.WriteLine("No employee with Employee id {0} found", empid);
                        }
                        else
                        {
                            Console.WriteLine("Employee with id {0} removed",empid);
                        }
                        break;
                    case 4:
                        Console.WriteLine("List of employees is- ");
                        cp.ShowEmployees();
                        break;
                    default:
                        Console.WriteLine("Chasma laav");
                        loop = false;
                        break;
                }
            }
            Console.ReadKey();
        }
*/
    }
}
