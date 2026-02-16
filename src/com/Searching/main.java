package com.Searching;

public class main {
    public static void main(String[] args) {
        int[] num = {34,90,45,32,21,98,65};
        int aimed = 21;

        System.out.println(LinearSearch(num,aimed));

    }
    public static int LinearSearch(int[] arr, int aimed){
        int [] a = arr;

        if(a.length==0){
            return -1;
        }
        for(int index =0; index<a.length; index++ ){
           int element = a[index];
           if(element==aimed){
               return index;
           }

        }
        return -1;
    }
}
