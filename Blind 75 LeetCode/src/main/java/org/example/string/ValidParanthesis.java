package org.example.string;

import java.util.Stack;

public class ValidParanthesis {

    public boolean checkValidParanthesis(String s){
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='[')st.push(ch);
            else{
                if(st.isEmpty())return false;
                else{
                    char top=st.pop();
                    if((ch==')' && top!='(')||
                       (ch=='}' && top!='{')||
                            (ch==']' && top!='['))return false;
                }
            }
        }

        return st.isEmpty();

    }
}
