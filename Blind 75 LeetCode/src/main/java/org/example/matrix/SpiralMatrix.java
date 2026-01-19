package org.example.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void printSpiralMatrix(int[][] matrix){
        int rows=matrix.length,col=matrix[0].length;
       int left=0,top=0,right=col-1,bottom=rows-1;
        List<Integer> list=new ArrayList<>();

        while(left<=right && top<=bottom){
            // Left to right
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            // Top to bottom
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);

            }
            right--;
            // Right to Left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //Bottom To top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        for(int x:list){
            System.out.print(x+" ");
        }
    }
}
