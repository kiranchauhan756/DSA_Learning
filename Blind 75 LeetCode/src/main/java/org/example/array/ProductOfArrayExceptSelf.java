package org.example.array;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int length=nums.length,right=1;
        int ans[]=new int [length];
        ans[0]=1;
        // Left products in array
        for(int i=1;i<length;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        // Right products in array
        for(int i=length-1;i>=0;i--){
            ans[i]=ans[i]*right;
            right*=nums[i];
        }
        return ans;
    }
}
