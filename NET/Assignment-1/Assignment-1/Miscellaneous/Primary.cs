using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_1.Miscellaneous
{
    class Primary
    {
        public static void Main(String[] ss)
        {
            SecondaryClass sc = new SecondaryClass();

            //Find Max and Min value in array
            //sc.maxnmin();

            //Swap numbers
            //sc.swap2numbers();

            //Swap 2 numbers without third variable
            //sc.swap2numbersagain();

            //Check if number is prime
            /*   Random rand = new Random();
               int no = rand.Next(1, 1000);
              //int no = 365;
               if (no == 1)
               {
                   Console.WriteLine("1 is not a Prime number");
               }else
               {
                   bool ans = sc.isItPrime(no);
                   if (ans == true)
                   {
                       Console.WriteLine("{0} is not a prime number", no);
                   }
                   else
                   {
                       Console.WriteLine("{0} is a prime number", no);
                   }
               }
               */

            //Find Prime in array;
            //sc.isArrayPrime();

            //Count words
            //sc.CountWords();

            // Count integers
            //sc.CountIntegers();

            //Convert To Opposite Case
            //sc.OppoCase();

            //Count positive and negative numbers
            //sc.CountposnegNumbers();

            //Swap max and min values
            //sc.maxnminswap();

            //Check if string is palindrome
            sc.checkPalindrome();
            Console.ReadKey();
        }
    }
}
