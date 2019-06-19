using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_1
{
    public class Book
    {
        private int BookID;
        private string BookName;
        private double BookPrice;
        private string AuthorName;

        public Book(int BookID, string BookName, double BookPrice, string AuthorName)
        {
            this.BookID = BookID;
            this.BookName = BookName;
            this.BookPrice = BookPrice;
            this.AuthorName = AuthorName;
        }

        public void GetDetails()
        {
            Console.WriteLine("Book Id- " + BookID);
            Console.WriteLine("Book Name- " + BookName);
            Console.WriteLine("Book Price- " + BookPrice);
            Console.WriteLine("Author Name- " + AuthorName);
        }



    }

    class BookClass
    {
       /* {
            Book bk = new Book(1,"10 Mistakes for taking CDAC",6969,"Donald Tatya");
            bk.GetDetails();
            Console.ReadKey();
        }*/
    }
}
