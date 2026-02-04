package org.example.array;

import java.util.ArrayList;
import java.util.List;
/*
   Time Complexity -O(2^n *n)
   Space Complexity -O(2^n)
 */
public class Subset_PowerSet {

    public static void printSubSet(int nums[]){
        List<List<Integer>>  subset=new ArrayList<>();

        for(int i=0;i<(1<<nums.length);i++){
            List<Integer> list=new ArrayList<>();
            for(int l=0;l<nums.length;l++){
                if((i & (1<<l))!=0)list.add(nums[l]);
            }
            subset.add(list);
        }

        System.out.println(subset);
    }
}
