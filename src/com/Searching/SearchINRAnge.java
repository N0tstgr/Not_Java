package com.Searching;

public class SearchINRAnge {
    public static void main(String[] args) {
        int[] arr = {2,5,6,7,9,22,21};
        int aimed = 9;
        int ans = range(arr,aimed);
        System.out.println(ans);


    }
    public static int range(int[] arr, int aimed){
        if(arr.length==0){
            return -1;
        }
        for(int a = 3; a<5; a++){
            if(arr[a]==aimed){
                return a;
            }
        }
        return -1;

    }
}
