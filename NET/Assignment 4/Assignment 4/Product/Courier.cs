using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_4.Product
{
    class Courier
    {
        private string courierName;
        private string courierAddress;

        public string CourierName
        {
            get
            {
                return courierName;
            }

            set
            {
                courierName = value;
            }
        }

        public string CourierAddress
        {
            get
            {
                return courierAddress;
            }

            set
            {
                courierAddress = value;
            }
        }

        public Courier(string courierName, string courierAddress)
        {
            this.CourierName = courierName;
            this.CourierAddress = courierAddress;
        }

        public void ReceiveProduct(ICourierProduct cv)
        {
            cv.GetToAddress();
            cv.GetFromAddress();
            cv.GetProductType();
        }
    }
}
