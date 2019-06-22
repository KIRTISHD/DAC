using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_4.Loan
{
    class LoanMain
    {
        public static void Main(string[] ss)
        {
            Loan home = new HomeLoan(1,"kd","kd@kd", 900,1000,12,12);
            Console.WriteLine("Pending Home loan amount-"+home.GetPendingLoan(100,2));
            Console.WriteLine("EMI is ->" + home.PayEMI(home.LoanAmount));
            Console.ReadKey();
        }
    }
}
