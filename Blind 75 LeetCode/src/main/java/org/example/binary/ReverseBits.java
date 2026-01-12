package org.example.binary;

/* Time Complexity=O(1)
    Space Complexity=O(1)
 */
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

    public void reverseBitsSol2(int n){
        int ans=0;
        for(int i=0;i<32;i++){
            ans=(ans << 1) | (n & 1);// for bit reversal
            n=n>>>1; // to right shift a number
        }
        System.out.println(ans);
    }
}
