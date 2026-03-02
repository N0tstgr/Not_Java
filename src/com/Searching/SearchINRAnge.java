package com.Searching;

import java.util.Arrays;

public class SearchINRAnge {
    public static void main(String[] args) {
        int[] arr = {2,5,6,7,9,22,21};
        int aimed = 29;
        int ans = range(arr,aimed,3,6);
        System.out.println(ans);


    }
    public static int range(int[] arr, int aimed, int start, int stop){
        if(arr.length==0){
            return -1;
        }
        for(int a = start; a<stop; a++){
            if(arr[a]==aimed){
                return a;
            }
        }
        return -1;

    }

    public static class Max2dArray {
        public static void main(String[] args) {
                    int[][] arr = {
                            {3,5,2,55 },
                            {90,56,43,21,87,93},
                            {44,77,88,99,00},
                            { 49,67,32,78},
                            {101,102,103,104 }
                    };
    //        int target = 105;
                    int[] ans = Max(arr);
                    System.out.println(Arrays.toString(ans));

                }

        public static int[] Max(int[][] arr ){
            int max = Integer.MIN_VALUE;
    //    int aimed = target;
            for(int i = 0; i<arr.length; i++){
                for(int j = 0; j<arr[i].length; j++){
                    if(arr[i][j]>max) {
                        max = arr[i][j];

                    }

                }
            }
            return new int[]{max};
        }
    }
}
