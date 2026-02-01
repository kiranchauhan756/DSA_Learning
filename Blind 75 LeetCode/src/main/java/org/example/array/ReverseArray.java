package org.example.array;

public class ReverseArray {
    public static void reverse(int[] arr, int n) {
        int end=n-1;
        for(int i=0;i<end;i++){
            int c=arr[i];
            arr[i]=arr[end];
            arr[end]=c;
            end--;
        }
        for(int x:arr)
            System.out.print(x+" ");
    }

}
