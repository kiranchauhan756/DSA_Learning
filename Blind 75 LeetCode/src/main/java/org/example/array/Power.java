package org.example.array;

public class Power {
    public static double printPower(int num,int pow){
        long n=pow;
        double ans=1.0;
        if(n<0)n*=-1;
        while(n>0){
            if(n%2==1){
                ans*=num;
                n-=1;
            }
            else{
                num*=num;
                n/=2;
            }
        }
        if(pow<0)ans=1.0/(double)ans;
        return ans;
    }
}
