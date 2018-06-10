package com.uma.prepalgo;

public class ReverseSignedInt {


        public static int reverse(int x) {
            int result = 0;

            while (x != 0)
            {
                int tail = x % 10;
                int newResult = result * 10 + tail;
                if ((newResult - tail) / 10 != result)
                { return 0; }
                result = newResult;
                x = x / 10;
            }

            return result;
        }

        public static void main(String args[]){
            System.out.println("The result is "+ reverse(1534236469));
        }

}
