package com.Searching;
import java.util.Arrays;
public class Searching2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {3,5,2,55 },
                {90,56,43,21,87,93},
                {44,77,88,99,00},
                { 49,67,32,78},
                {101,102,103,104 }
        };
        int target = 99;
        int[] ans = Search2d(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] Search2d(int[][] arr, int target){
         int aimed = target;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
            if(arr[i][j]==aimed) {
                return new int[]{i,j};
              }

            }
        }
        return new int[]{-1,-1};
    }
}
