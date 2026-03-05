package com.Searching.binary;

public class OrderAgnosticsBs {
    public static void main(String[] args) {
//        int[]arr = {2,3,4,6,7,8,9,10,11,12};
        int[]arr = {10,9,8,7,6,5,4,3,2,1};
        int target = 10;
        int ans = orderAgnosticsbs(arr,target);
        System.out.println(ans);

    }
    public static int orderAgnosticsbs(int[] arr, int target){
        boolean Isasc;
        int start = 0;
        int end = arr.length-1;
        if(arr[start]<arr[end]){
            Isasc = true;
        }else{
            Isasc = false;
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(Isasc){
                if(target<arr[mid]){
                    end = mid - 1;
                }else if(target>arr[mid]){
                    start = mid +1;
                }
            }else{
                if(target>arr[mid]){
                    end = mid - 1;
                }else if (target<arr[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
