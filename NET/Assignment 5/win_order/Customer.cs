using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace win_order
{
    class Customer
    {
        private static int counter = 1;
        private int CustomerId;
        private string CustomerName;
        private string CustomerCity;
        private string CustomerEmail;
        private string CustomerGender;
        private string CustomerPassword;
        private List<Order> od = new List<Order>();

        public Customer(string customerName, string customerCity, string customerEmail, string customerGender, string customerPassword)
        {
            CustomerId = counter++;
            CustomerName = customerName;
            CustomerCity = customerCity;
            CustomerEmail = customerEmail;
            CustomerGender = customerGender;
            CustomerPassword = customerPassword;

    }

        public bool AddOrder(Order ord)
        {
            try
            {
                this.od.Add(ord);
                return true;
            }
            catch (Exception)
            {
                return false;
            }
            
        }

        public int PCustomerId { get => CustomerId; }
        public string PCustomerName { get => CustomerName; set => CustomerName = value; }
        public string PCustomerPassword { get => CustomerPassword; }
        /* public string PCustomerCity { get => CustomerCity; set => CustomerCity = value; }
         public string PCustomerEmail { get => CustomerEmail; set => CustomerEmail = value; }
         public string PCustomerGender { get => CustomerGender; set => CustomerGender = value; }
         */

    }
}
