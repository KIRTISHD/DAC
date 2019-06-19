using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment_1
{
    class Program
    {
        static void SumOfArrays()
        {
            int sum = 0;
            int[] arr = { 1,2,3,4,5,5,5,5,5,5};
            for(int i =0; i < arr.Length; i++)
            {
                sum += arr[i];
            }
            Console.WriteLine("Sum of numbers is- "+ sum);
        }

        static void secondLetter()
        {
            string abc = "Nitin la sangla yeta";
            Console.WriteLine(abc[2]);
        }

        static void third()
        {
            int[] arr = { 1, 2, 3, 4, 5, 6 };
            for(int i=0; i< arr.Length; i++)
            {
                arr[i] = arr[i] + 2;
            }
            for(int i = 0; i< arr.Length; i++)
            {
                Console.WriteLine(arr[i]);
            }
        }
        static void a2z()
        {
            string andhera = "KayamRahe";
            char[] kalala = andhera.ToCharArray();
            for(int i =0; i<andhera.Length; i++)
            {
                if (!Char.IsLetter(kalala[i]))
                {
                    Console.WriteLine("Does not have characters");
                    return;
                }
            }
            Console.WriteLine("Has Characters");
            
        }
      /*  public static void Main(string[] args)
        {
            //SumOfArrays();
            //secondLetter();
            //third();
            a2z();
            Console.ReadLine();
        }
        */
    }
}
