package org.example.string;

public class ValidWord {
    public boolean isValid(String word) {
        if(word==null || word.length()<3)return false;
        boolean vowel=false,cons=false;
        String vow="aeiouAEIOU";
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(!Character.isLetterOrDigit(c))return false;
            if(Character.isLetter(c)){
                if(vow.indexOf(c)!=-1){
                    vowel=true;
                }
                else {
                    cons=true;
                }
            }
        }
        return vowel && cons;
    }
}
