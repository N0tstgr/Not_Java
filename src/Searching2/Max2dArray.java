package Searching2;

import java.util.Arrays;

public class Max2dArray {
    public static void main(String[] args) {
                int[][] arr = {
                        {3,5,2,55 },
                        {90,56,43,21,87,93},
                        {44,77,88,99,00},
                        { 49,67,32,78},
                        {101,102,103,104 }
                };
//        int target = 105;
                int[] ans = Max(arr);
                System.out.println(ans);

            }

    public static int[] Max(int[][] arr ){
        int max = arr[0][0];
//    int aimed = target;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(max<arr[i][i]) {
                    max = arr[i][j];

                }

            }
        }
        return new int[]{max};
    }
}





