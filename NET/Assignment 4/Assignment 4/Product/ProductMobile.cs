using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_4.Product
{
    class ProductMobile : ICourierProduct
    {
        private int iD;
        private int price;
        private string companyName;
        private int ram;
        private string os;

        public ProductMobile()
        {

        }
        public ProductMobile(int iD, int price, string companyName, int ram, string os)
        {
            this.iD = iD;
            this.price = price;
            this.companyName = companyName;
            this.ram = ram;
            this.os = os;
        }

        public int ID
        {
            get
            {
                return iD;
            }

            set
            {
                iD = value;
            }
        }

        public int Price
        {
            get
            {
                return price;
            }

            set
            {
                price = value;
            }
        }

        public string CompanyName
        {
            get
            {
                return companyName;
            }

            set
            {
                companyName = value;
            }
        }

        public int Ram
        {
            get
            {
                return ram;
            }

            set
            {
                ram = value;
            }
        }

        public string Os
        {
            get
            {
                return os;
            }

            set
            {
                os = value;
            }
        }

        public void GetFromAddress()
        {
            Console.WriteLine("this is from mobile address");
        }

        public void GetToAddress()
        {
            Console.WriteLine("this is  to mobile address");
        }

        public void GetProductType()
        {
            Console.WriteLine("this is mobile.");
        }

        public void Start()
        {
            Console.WriteLine("Chalu jhala mobile");
        }

        public void Stop()
        {
            Console.WriteLine("Mobile band jhala");
        }

        public void Call()
        {
            Console.WriteLine("Ganya call lav");
        }

        public void SendMsg()
        {
            Console.WriteLine("Gnaya range aali, message pathav");
        }
    }
}
