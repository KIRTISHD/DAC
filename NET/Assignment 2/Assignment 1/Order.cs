using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_1
{
    public class Order
    {
        private static int autogen = 1;
        private int orderId;
        private string customerName;
        private string itemName;
        private double itemPrice;
        private int itemQuantity;

        public Order(string CustomerName, string ItemName, double ItemPrice, int ItemQuantity )
        {
            this.orderId = autogen;
            this.customerName = CustomerName;
            this.itemName = ItemName;
            this.itemPrice = ItemPrice;
            this.itemQuantity = ItemQuantity;
        }

        public double GetOrderAmount(int GST)
        {
            return itemPrice + (itemPrice * GST);
        }

        public int POrderID {
            get { return orderId; }
        }
        public string PCustomerName {
            get { return customerName; }
            set { customerName = value; }
        }
        public string PItemName
        {
            get { return itemName; }
            set { itemName = value; }
        }
        public double PItemPrice
        {
            get { return itemPrice; }
            set { itemPrice = value; }
        }
        public int PItemQuantity
        {
            get { return itemQuantity; }
            set { itemQuantity = value; }
        }

    }

    class OrderClass
    {
        /*public static void Main(String [] ss)
        {
            Order od = new Order("Nitin", "Java", 25, 3);
            //Console.WriteLine("Govinda aala re");
            Console.WriteLine("Order id- " + od.POrderID);
            Console.WriteLine("Customer Name- " + od.PCustomerName);
            Console.WriteLine("Item name- " + od.PItemName);
            Console.WriteLine("Item price- " + od.PItemPrice);
            Console.WriteLine("Item Quantity- " + od.PItemQuantity);

            od.PItemQuantity = 10;

            double newamt = od.GetOrderAmount(18) * od.PItemQuantity;

            Console.WriteLine("Final amount aali re aali - " + newamt);
            Console.ReadKey();
        }*/
    }
}
