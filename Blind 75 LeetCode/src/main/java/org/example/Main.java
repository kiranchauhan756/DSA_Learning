package org.example;

import org.example.binary.Counting_Bits;
import org.example.binary.NumberOf_1_Bits;
import org.example.binary.SumOfTwoNumbers;

/*
     n & 1= n % 2   (& means getting remainder on dividing by 2)
     n >> 1= n / 2   (>> right shift means dividing a number by 2)
     n << 1 =n * 2   (<< left shift means multiply a number by 2)

 */
public class Main {
    public static void main(String[] args) {
       /* SumOfTwoNumbers obj=new SumOfTwoNumbers();
        System.out.println(obj.sumOfTwIntegers(100,100));
     */
//        NumberOf_1_Bits obj1=new NumberOf_1_Bits();
//        System.out.println(obj1.hammingWeight(20));
        Counting_Bits countingBits=new Counting_Bits();
        countingBits.countBits(20);
    }

}