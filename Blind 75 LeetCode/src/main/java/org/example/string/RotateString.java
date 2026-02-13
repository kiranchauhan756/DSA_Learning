package org.example.string;
/*
    Time Complexity=O(n)
    Space Complexity=O(n)
*/
public class RotateString {
    public boolean rotateString(String s, String goal) {
        int i=0;
        while(i<s.length()){
            String ans=s.substring(i+1,s.length())+s.substring(0,i+1);
            if(ans.equals(goal))return true;
            i++;
        }
        return false;
    }
}
