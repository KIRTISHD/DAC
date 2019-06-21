using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_3.Order
{
    class Order_Overseas : Order
    {

        public Order_Overseas()
        {

        }

        public Order_Overseas(int orderId, string customerName, int quantity, double itemPrice)
        {
            this.orderId = orderId;
            this.customerName = customerName;
            this.quantity = quantity;
            this.itemPrice = itemPrice;
        }
        public override double GetOrderValue()
        {
            double amount = ItemPrice * Quantity;
            return (amount + (amount*0.10));
        }
    }
}
