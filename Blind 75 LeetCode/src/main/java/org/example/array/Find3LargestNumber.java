package org.example.array;

public class Find3LargestNumber {
    public static void find3LargestNumber(int arr[]){
        int firstNumber=Integer.MIN_VALUE;
        int secondNumber=Integer.MIN_VALUE;
        int thirdNumber=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstNumber){
                thirdNumber=secondNumber;
                secondNumber=firstNumber;
                firstNumber=arr[i];
            }else if(arr[i]>secondNumber){
                thirdNumber=secondNumber;
                secondNumber=arr[i];
            }else if(arr[i]>thirdNumber){
               thirdNumber=arr[i];
            }
        }
        // 1,5,-5,9,2,0,-8,-10
        System.out.println("First Number : "+firstNumber);
        System.out.println("Second Number : "+secondNumber);
        System.out.println("Third Number : "+thirdNumber);
    }
}
