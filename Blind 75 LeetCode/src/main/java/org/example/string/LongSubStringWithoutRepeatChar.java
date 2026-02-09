package org.example.string;

import java.util.HashSet;

public class LongSubStringWithoutRepeatChar {

    //Brute force

    public int lengthOfLongestSubstring(String s) {
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            String ch=""+s.charAt(i);
            int index=sb.indexOf(ch);
            if(index!=-1)
                sb.delete(0,index+1);

            sb.append(ch);
            count=Math.max(count,sb.length());
        }
        System.out.println(sb);
        return count;
    }


    // 2 pointer Approach
    public int lengthOfLongestSubstring2Pointer(String s) {
        HashSet<Character> hs=new HashSet<>();
        int left=0,max=0;
        for(int right=0;right<s.length();right++){
            while(hs.contains(s.charAt(right))){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(right));
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}
