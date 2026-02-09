package org.example.array;

public class MaxProductSubArray {
    public int maxProduct(int[] nums) {
        int left=1,right=1,maxProduct=nums[0];
        for(int i=0;i<nums.length;i++){
            left=left==0?1:left;
            right=right==0?1:right;
            left*=nums[i];
            right*=nums[nums.length-i-1];
            maxProduct=Math.max(maxProduct,Math.max(left,right));
        }
        return maxProduct;
    }
}
