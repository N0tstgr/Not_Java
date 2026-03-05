package com.Searching.binary;

public class BinarySearchDescending {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,-4,-90,-98};
        int target = -98;
        int ans = binarySearchdescending(arr,target);
        System.out.println(ans);

    }
    public static int binarySearchdescending(int[]arr, int  target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target>arr[mid]){
                end = mid - 1;
            }else if(target<arr[mid]){
                start = mid  + 1;

            }else{
                return mid;
            }
        }
        return -1;
    }
}
