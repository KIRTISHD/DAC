using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_4.Loan
{
    class HomeLoan : Loan
    {
        public override double PayEMI(int amount)
        {
            double numerator = LoanAmount * Rate * Math.Pow((1 + Rate) , (Duration / 12));
            double denominator = Math.Pow((1 + Rate), ((Duration / 12)-1));

            return (numerator / denominator); 
        }

        public override double GetPendingLoan(int amt, int months)
        {
            return LoanAmount - (PayEMI(amt) * Convert.ToDouble(months));
        }
    }
}
