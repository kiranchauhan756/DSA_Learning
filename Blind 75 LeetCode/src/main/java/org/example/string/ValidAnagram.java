package org.example.string;
/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
 */

/*
   Time Complexity=O(n)
   Space Complexity=O(1)
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int freq[]=new int[26];
        for(char c: s.toCharArray())freq[c-'a']++;
        for(char c:t.toCharArray())freq[c-'a']--;
        for(int x: freq)if(x!=0)return false;
        return true;
    }
}
