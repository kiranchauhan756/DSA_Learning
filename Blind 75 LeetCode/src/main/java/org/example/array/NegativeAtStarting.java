package org.example.array;

public class NegativeAtStarting {
    // In this method the order is not maintained
    public static void  negToStartWithoutOrderMaintain(int arr[]){
        int j=0,temp;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0 && i!=j){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();

    }

    // In this method the order is maintained
    public static void negToStartWithOrderMaintain(int arr[]){
        int j,current;
        for(int i=0;i<arr.length;i++){
            current=arr[i];
            if(current>=0){
                continue;
            }
           j=i-1;
            while(j>=0 && arr[j]>=0){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=current;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
