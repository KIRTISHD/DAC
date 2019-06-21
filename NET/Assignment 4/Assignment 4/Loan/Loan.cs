using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_4.Loan
{
    abstract class Loan
    {
        private int loanID;
        private string customerName;
        private string customerEmailID;
        private int customerMobileNo;
        private int loanAmount;
        private int duration;
        private double rate;

        public Loan()
        {

        }

        public Loan(int loanID, string customerName, string customerEmailID, int customerMobileNo, int loanAmount, int duration, double rate)
        {
            this.loanID = loanID;
            this.customerName = customerName;
            this.customerEmailID = customerEmailID;
            this.customerMobileNo = customerMobileNo;
            this.loanAmount = loanAmount;
            this.duration = duration;
            this.rate = rate;
        }

        public abstract double PayEMI(int amount);

        public virtual double GetPendingLoan(int amt,int months)
        {
            return LoanAmount-(PayEMI(amt) * Convert.ToDouble(months));
        }

        public int LoanID
        {
            get
            {
                return loanID;
            }

            set
            {
                loanID = value;
            }
        }

        public string CustomerName
        {
            get
            {
                return customerName;
            }

            set
            {
                customerName = value;
            }
        }

        public string CustomerEmailID
        {
            get
            {
                return customerEmailID;
            }

            set
            {
                customerEmailID = value;
            }
        }

        public int CustomerMobileNo
        {
            get
            {
                return customerMobileNo;
            }

            set
            {
                customerMobileNo = value;
            }
        }

        public int LoanAmount
        {
            get
            {
                return loanAmount;
            }

            set
            {
                loanAmount = value;
            }
        }

        public int Duration
        {
            get
            {
                return duration;
            }

            set
            {
                duration = value;
            }
        }

        public double Rate
        {
            get
            {
                return rate;
            }

            set
            {
                rate = value;
            }
        }
    }
}
