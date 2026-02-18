package com.Searching;
import java.util.Arrays;
public class SearchingStrings {
    public static void main(String[] args) {
String subject = "mathematics";
char aimed = 'h';
boolean ans = findit(subject, aimed);
        System.out.println(ans);
        System.out.println(Arrays.toString(subject.toCharArray()));



    }
    public static boolean findit(String str, char aimed){
//        String b = str;
        if(str.length()==0){
            return false;
        }       for(int  index = 0; index<str.length(); index++){
//             char letter = b.length(index);
            if(aimed == str.charAt(index)){
                return true;

            }

        }
        return false;


    }
//    public static boolean findit2(String str, char aimed){
////        String b = str;
//        if(str.length()==0){
//            return false;
//        }       for(char ch: str.toCharArray()){
////             char letter = b.length(index);
//            if(ch == aimed){
//                return true;
//
//            }
//
//        }
//        return false;
//
//
//    }


}
