using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_4.Product
{
    class ProductBook
    {
        private int iD;
        private string authorName;
        private string title;
        private int price;
        private int pages;

        public ProductBook()
        {

        }

        public ProductBook(int iD, string authorName, string title, int price, int pages)
        {
            this.iD = iD;
            this.authorName = authorName;
            this.title = title;
            this.price = price;
            this.pages = pages;
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

        public string AuthorName
        {
            get
            {
                return authorName;
            }

            set
            {
                authorName = value;
            }
        }

        public string Title
        {
            get
            {
                return title;
            }

            set
            {
                title = value;
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

        public int Pages
        {
            get
            {
                return pages;
            }

            set
            {
                pages = value;
            }
        }
    }
}
