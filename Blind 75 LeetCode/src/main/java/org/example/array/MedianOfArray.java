package org.example.array;

public class MedianOfArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,prev=0,curr=0;
        int length=nums1.length+nums2.length;
        int arrLength=0;
        for(int x=0;x<(length/2)+1;x++){
            prev=curr;
            if(i<nums1.length && (j>=nums2.length  || nums1[i]<=nums2[j]))
                curr=nums1[i++];
            else
                curr=nums2[j++];

        }
        return length%2==0?(prev+curr)/2.0:curr;
    }
}
