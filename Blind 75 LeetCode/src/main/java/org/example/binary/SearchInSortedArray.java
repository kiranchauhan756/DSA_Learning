package org.example.binary;
/*
Time Complexity-O(log n)
Space Complexity-O(1)
 */
public class SearchInSortedArray {

    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1,mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target)return mid;
            if(nums[mid]<target)low=mid+1;
            if(nums[mid]>target)high=mid-1;
        }
        return -1;
    }
}
