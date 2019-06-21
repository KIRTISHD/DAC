using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_3.Book
{
    class Ebook : Book
    {
        private int bookId;
        private string bookTitle;
        private string author;
        private double price;
        private int noOfPages;
        private int size;
        private string format;

        public Ebook()
        {

        }

        public Ebook(int bookId, string bookTitle, string author, double price, int noOfPages, int size, string format)
        {
            this.bookId = bookId;
            this.bookTitle = bookTitle;
            this.author = author;
            this.price = price;
            this.noOfPages = noOfPages;
            this.size = size;
            this.format = format;
        }

        public string Format
        {
            get { return format; }
            set { format = value; }
        }


        public int Size
        {
            get { return size; }
            set { size = value; }
        }


        public new int NoOfPages
        {
            get { return noOfPages; }
            set { noOfPages = value; }
        }


        public new double Price
        {
            get { return price; }
            set { price = value; }
        }


        public new  string Author
        {
            get { return author; }
            set { author = value; }
        }


        public new string BookTitle
        {
            get { return bookTitle; }
            set { bookTitle = value; }
        }


        public int BookId
        {
            get { return bookId; }
            set { bookId = value; }
        }



    }
}
