using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_1
{
    class Product
    {
        private int ProductId;
        private string ProductName;
        private double ProductPrice;
        private string ProductType;

        public Product(int ProductId, string ProductName, double ProductPrice, string ProductType)
        {
            this.ProductId = ProductId;
            this.ProductName = ProductName;
            this.ProductPrice = ProductPrice;
            this.ProductType = ProductType;
        }

        public void GetProductDetails()
        {
            Console.WriteLine("Product Id- " + ProductId);
            Console.WriteLine("Product Name- " + ProductName);
            Console.WriteLine("Product Price- " + ProductPrice);
            Console.WriteLine("Product Type- " + ProductType);
        }
    }

    class ProductProgram
    {
       /* public static void Main(String[] ss)
        {
            Product pd = new Product(10, "TootBrush", 100, "Dat Ghasayla");
            pd.GetProductDetails();
            Console.ReadKey();
        }*/
    }

    
}

