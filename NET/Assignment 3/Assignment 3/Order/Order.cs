using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_3.Order
{
    class Order
    {
        protected int orderId;
        protected string customerName;
        protected int quantity;
        protected double itemPrice;

        public Order()
        {

        }

        public Order(int orderId, string customerName, int quantity, double itemPrice)
        {
            this.orderId = orderId;
            this.customerName = customerName;
            this.quantity = quantity;
            this.itemPrice = itemPrice;
        }

        public int OrderId
        {
            get
            {
                return orderId;
            }

            set
            {
                orderId = value;
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

        public int Quantity
        {
            get
            {
                return quantity;
            }

            set
            {
                quantity = value;
            }
        }

        public double ItemPrice
        {
            get
            {
                return itemPrice;
            }

            set
            {
                itemPrice = value;
            }
        }

        public virtual double GetOrderValue()
        {
            return ItemPrice * Quantity;
        }

       /* public void xyz()
        {
            Console.WriteLine("in xyz");
        }*/


    }
}
