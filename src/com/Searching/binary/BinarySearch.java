package com.Searching.binary;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,-2,6,9,30,22,54,549};
        int target = 549;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }
    //return the index
    public static int binarySearch(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            //find the middle element
            //int mid = (start+end)/2 //might be possible that (start+end) exceed the range of the int
            if(target<arr[mid]) {
                end = start - 1;
            }if(target>arr[mid]){
                    start = end-1;
                }else{
                //ans
                return mid;
            }


        }
        return -1;
    }

}
