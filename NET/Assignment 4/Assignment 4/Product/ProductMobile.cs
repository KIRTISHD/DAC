using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_4.Product
{
    class ProductMobile
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
    }
}
