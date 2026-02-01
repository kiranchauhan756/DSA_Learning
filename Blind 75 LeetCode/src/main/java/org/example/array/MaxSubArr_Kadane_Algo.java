package org.example.array;

import java.util.ArrayList;
import java.util.List;

public class MaxSubArr_Kadane_Algo {

    public static void findMaxSubArray(int nums[]){
        int max=Integer.MIN_VALUE,sum=0;
        int ansStart=-1,ansEnd=-1,start=0;
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(sum==0)start=i;
            sum+=nums[i];
            if(sum>max){
                max=sum;
                ansStart=start;
                ansEnd=i;
            }
            if(sum<0)sum=0;
        }
        System.out.println("Maximum SubArray sum is  "+max);

        for(int i=ansStart;i<=ansEnd;i++){
           list.add(nums[i]);
        }

        System.out.println("The subArray is :");
        System.out.println(list);
    }
}
