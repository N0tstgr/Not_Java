package com.Searching;

public class main {
    public static void main(String[] args) {
        int[] num = {34,90,45,32,21,98,65};
        int aimed = 45;

//        System.out.println(LinearSearch(num,aimed));
        System.out.println(LinearSearch2(num,aimed));


    }
    public static int LinearSearch(int[] arr, int aimed){
        int [] a = arr;

        if(a.length==0){
            return -1;
        }
        for(int element:a){

           if(element==aimed){
               return element;
           }

        }
        return -1;
    }
    public static int LinearSearch2(int[] arr, int aimed){
        int [] a = arr;

        if(a.length==0){
            return -1;
        }
        for(int index = 0; index<a.length; index++){
            int element = arr[index];

            if(element==aimed){
                return index;
            }

        }
        return -1;
    }

}
