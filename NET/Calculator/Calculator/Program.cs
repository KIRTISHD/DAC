using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calculator
{
    class Program
    {
        static int add(int x, int y)
        {
            return x + y;
        }

        static int subtract(int x, int y)
        {
            return x - y;
        }

        static int multiply(int x, int y)
        {
            return x * y;
        }

        static double divide(int x, int y)
        {
            return Convert.ToDouble(x / y);
        }
        static void Main(string[] args)
        {
            Console.WriteLine("Enter first number-");
            int x = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter second number-");
            int y = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Enter the operation you want to perform + - / *");
            var op = Console.ReadLine();
            switch (op)
            {
                case "+":
                    Console.WriteLine("Addition of two numbers is->" + add(x, y));
                    break;
                case "-":
                    Console.WriteLine("Subtraction of two numbers is->" + subtract(x, y));
                    break;
                case "*":
                    if (y == 0 || x==0)
                    {
                        Console.WriteLine("One of the numbers is 0");
                        Console.WriteLine("Badal salya");
                        break;
                    }
                    Console.WriteLine("Multiplication of two numbers is->" + multiply(x, y));
                    break;
                case "/":
                    if (y == 0)
                    {
                        Console.WriteLine("Denominator cannot be 0");
                        Console.WriteLine("Kal cha aptitude class nahi kela ka?");
                        break;
                    }
                    Console.WriteLine("Division of two numbers is->" + divide(x, y));
                    break;
                default :
                    Console.WriteLine("Java kar ja");
                    break;

            }

            Console.WriteLine("Ganya program chalala");
            Console.ReadLine();
        }
    }
}
