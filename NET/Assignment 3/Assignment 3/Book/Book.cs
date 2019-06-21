using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_3.Book
{
    class Book
    {
        private int bookID;
        private string bookTitle;
        private string author;
        private double price;
        private int noOfPages;

        public Book()
        {

        }

        public Book(int bookID, string bookTitle, string author, double price, int noOfPages)
        {
            this.bookID = bookID;
            this.bookTitle = bookTitle;
            this.author = author;
            this.price = price;
            this.noOfPages = noOfPages;
        }

        public int BookID
        {
            get
            {
                return bookID;
            }
            set
            {
                bookID = value;
            }
        }

        public string BookTitle
        {
            get
            {
                return bookTitle;
            }

            set
            {
                bookTitle = value;
            }
        }

        public string Author
        {
            get
            {
                return author;
            }

            set
            {
                author = value;
            }
        }

        public double Price
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

        public int NoOfPages
        {
            get
            {
                return noOfPages;
            }

            set
            {
                noOfPages = value;
            }
        }

        
    }
}
