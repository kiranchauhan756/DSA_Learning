package org.example.binary;

public class ReverseBits {

    public void reverseBits(int n){
        StringBuilder rev=new StringBuilder("");
         while(n>0){
             rev.append(String.valueOf(n%2));
             n/=2;
         }
         String ans=String.valueOf(rev.reverse());
        ans=String.format("%32s" ,ans).replace(' ','0');
        rev.setLength(0);
        rev.append(ans).reverse();
        System.out.println(Integer.parseInt(rev.toString(),2));
    }
}
