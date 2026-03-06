package com.Searching;

public class EvenNodigit {
    public static void main(String[] args) {
        int[] arr = {33,564,7890,321,22,900};
        int ans = EvenNoDigit(arr);
        System.out.println(ans);


    }
    public static int EvenNoDigit(int[] arr){
        int count = 0;
        int rem = 0;
        int count1 = 0;
        int digit = 0;
        int digit1 = 0;
        for(int i = 0; i<arr.length; i++){
            while(arr[i]!=0) {
                rem = arr[i] % 10;
                if (rem >= 0) {
                    count++;
                    digit1 = count;
                }

                arr[i] = arr[i] / 10;
            }
            if(digit1%2==0){
                count1++;
                digit = count1;
            }





        }
        return digit;


    }
}

