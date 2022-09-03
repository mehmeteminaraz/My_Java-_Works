package javaWorks;

import java.util.Arrays;

public class C55_MultiDimensionalArrays {
    public static void main(String[] args) {

        int arr[][] = { {1,2,3}, {10,7} };


        System.out.println(arr[0][2]);    // 3


        System.out.println( Arrays.toString (arr[1]));   // [10, 7]

        System.out.println( Arrays.deepToString (arr)); // [[1, 2, 3], [10, 7]]












    }
}








