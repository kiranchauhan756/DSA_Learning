package org.example;

import org.example.array.ContainsDuplicate;
import org.example.array.FindMin_In_Rotated_Sorted_Array;
import org.example.array.Power;
import org.example.array.ProductOfArrayExceptSelf;
import org.example.array.TwoSum;
import org.example.binary.Counting_Bits;
import org.example.binary.MissingNumber;
import org.example.binary.NumberOf_1_Bits;
import org.example.binary.ReverseBits;
import org.example.binary.SumOfTwoNumbers;
import org.example.matrix.SpiralMatrix;
import org.example.string.ValidParanthesis;

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
//        Counting_Bits countingBits=new Counting_Bits();
//        countingBits.countBits(20);
//
//        MissingNumber missingNumber=new MissingNumber();
//        System.out.println("Missing number in integer is: ");
//        System.out.println(missingNumber.findMissingNumber(new int []{9,6,4,2,3,5,7,0,1}));
//        ReverseBits rev=new ReverseBits();
//        rev.reverseBits(8);
//        rev.reverseBitsSol2(8);
//        ContainsDuplicate con=new ContainsDuplicate();
//        System.out.println(con.containsDuplicate(new int[]{1,2,3,4,5,31,22}));

//        ValidParanthesis valid=new ValidParanthesis();
//        System.out.println(valid.checkValidParanthesis("()[]{}"));
//        System.out.println(valid.checkValidParanthesis("()[]{"));
//        FindMin_In_Rotated_Sorted_Array find =new FindMin_In_Rotated_Sorted_Array();
//        System.out.println(find.findInRotatedSortedArray(new int []{8,2,5,1,3,6,7}));
//        SpiralMatrix.printSpiralMatrix(new int [][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}});
//        TwoSum.printTwoSum(new int []{2,7,11,15},9);
//        ProductOfArrayExceptSelf product=new ProductOfArrayExceptSelf();
//        int ans[]=product.productExceptSelf(new int [] {1,2,3,4,5});
//        for(int x: ans){
//            System.out.print(x+" ");
//        }
//        System.out.println();

        System.out.println(Power.printPower(2,-2));
    }

}