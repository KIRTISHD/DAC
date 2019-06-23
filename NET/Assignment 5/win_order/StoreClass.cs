using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace win_order
{
    public class StoreClass
    {
        private static List<Customer> cust = new List<Customer>();

        public static void addCustomer(string custName, string custEmail, string custCity, string custGender, string custPassword)
        {
            cust.Add(new Customer(custName, custCity, custEmail, custGender, custPassword));
        }

        public static bool checkCred(string username, string pass)
        {
            foreach(Customer cc in cust)
            {
                if (cc.PCustomerName.Equals(username) && cc.PCustomerPassword.Equals(pass))
                {
                    return true;
                }
            }
            return false;
        }
    }
}
