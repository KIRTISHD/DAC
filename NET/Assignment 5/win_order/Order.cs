using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace win_order
{
    class Order 
    {
        private int OrderID;
        //private Customer customer;
        private string ItemName;
        private int ItemPrice;
        private int ItemQty;
        private string OrderCity;
        private string PaymentType;

        public Order(int orderID, string itemName, int itemPrice, int itemQty, string orderCity, string paymentType)
        {
            OrderID = orderID;
            ItemName = itemName;
            ItemPrice = itemPrice;
            ItemQty = itemQty;
            OrderCity = orderCity;
            PaymentType = paymentType;
        }

        public int getOrderValue()
        {
            return this.ItemPrice;
        }
    }
}
