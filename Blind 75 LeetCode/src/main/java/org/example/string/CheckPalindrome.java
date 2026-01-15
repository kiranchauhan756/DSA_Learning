package org.example.string;
/*
Given an integer x, return true if x is a palindrome, and false otherwise.
Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 */

/*
   Time Complexity=O(log n)
   Space Complexity=O(1)
 */
public class CheckPalindrome {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int rev=0,temp=x;
        while(temp!=0){
            rev=(temp%10)+rev*10;
            temp/=10;
        }
        return rev==x;

    }
}
