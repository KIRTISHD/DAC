using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_3.Order
{
    class OrderMain
    {
        public static void Main(string[] ss)
        {
            Order od = new Order(1, "Ganya", 200, 5);
            Console.WriteLine("Total amount is->" + od.GetOrderValue());

            Order od1 = new Order_Overseas(1, "Ganya", 200, 5);
            Console.WriteLine("Total amount is->" + od1.GetOrderValue());
           // od1.xyz();
            Console.ReadKey();


        }
    }
}
