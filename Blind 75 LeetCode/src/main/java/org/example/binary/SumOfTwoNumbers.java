package org.example.binary;
/*
Time Complexity=O(n)
Space complexity=O(1)
 */


/*
Notes To Remember
1. XOR operator only works with sum without carry
2. & is providing carry
3. we are not adding carry in the same bit in which it generates so shifting by left by 1 using <<
 */

/*
Given two integers a and b, return the sum of the two integers without using the operators + and -.
Example 1:

Input: a = 1, b = 2
Output: 3
Example 2:

Input: a = 2, b = 3
Output: 5
*/

public class SumOfTwoNumbers {
    public int sumOfTwIntegers(int a,int b){

        while(b!=0){
            int carry=a & b;
            a=a^b;
            b=carry<<1;
        }
        return a;
    }
}
