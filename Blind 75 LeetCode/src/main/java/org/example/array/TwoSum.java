package org.example.array;

import java.util.HashMap;

public class TwoSum {
    public static void printTwoSum(int []arr,int target){
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int ans []=new int [2];
        for(int i=0;i<arr.length;i++){
            int ele=target-arr[i];
            if(mpp.containsKey(ele)){
                ans[0]=mpp.get(ele);
                ans[1]=i;
                break;
            }
            else{
                mpp.put(arr[i],i);
            }
        }
        System.out.println("The two ele whose sum = "+target+" are present at index: "+ans[0]+" and "+ans[1]);
    }
}
