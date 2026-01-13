package org.example.array;

import java.util.HashSet;

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.
Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.
*/

/*
   Time Complexity-O(n)
   Space Complexity-O(n)
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>((int)(nums.length / 0.75f) + 1);
        for(int x:nums){
            if(!set.add(x))return true;
        }
        return false;
    }
}
