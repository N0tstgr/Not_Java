package com.Searching;

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
}
