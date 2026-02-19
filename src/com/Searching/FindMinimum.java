package com.Searching;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {4,6,22,90,76,4390,8};
        System.out.println(Min(arr));

    }
    public static int Min(int[] arr){
        int min = arr[0];
        if(arr.length==0){
            return -1;
        }
        for(int i = 1; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;

    }
}
