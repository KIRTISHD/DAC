using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_1
{
    public class Console_Bank_System
    {
        private int accountID;
        private string customerName;
        private string customerAddress;
        private double accountBalance;

        public Console_Bank_System(int accountID, string customerName, string customerAddress, double accountBalance)
        {
            this.accountID = accountID;
            this.customerName = customerName;
            this.customerAddress = customerAddress;
            this.accountBalance = accountBalance;
        }

        public void Withdraw(double amt)
        {
            if (accountBalance < amt)
            {
                Console.ForegroundColor = ConsoleColor.DarkRed;
                Console.WriteLine("Insufficient Account Balance.");
                Console.ForegroundColor = ConsoleColor.White;
                //Console.WriteLine("Khatyat paise nahi. Baban kadun mang");
                return;
            }
            accountBalance = accountBalance - amt;
        }

        public void Deposit( double amt)
        {
            if (amt > 100000)
            {
                //Console.WriteLine("Jasti Paise aale ha? Thode dya ki ithe");
            }
            accountBalance += amt;
        }

        public void CheckBalance()
        {
            Console.WriteLine("Your Balance is->" + accountBalance);
            //Console.WriteLine("Khatyat {0} rupade aahe", accountBalance);
        }
    }
}
