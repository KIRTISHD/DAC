using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calculator
{
    public class Calculator
    {
        public int GetSum(int n1, int n2)
        {
            return n1 + n2;
        }
        public int GetSubtract(int n1, int n2)
        {
            return n1 - n2;
        }
        public int GetMultiply(int n1, int n2)
        {
            return n1 * n2; 
        }
        public double GetDivide( int n1, int n2)
        {
            return Convert.ToDouble(n1 / n2);
        }
    }
}
