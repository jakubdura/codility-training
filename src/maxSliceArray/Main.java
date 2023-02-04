package maxSliceArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World !");

        int[] A = {3, 2, -6, 4, 0};

        System.out.println("solution: " + solution(A));

    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int len = A.length;
        int maxSum = A[0];
        int localSum = A[0];

        for (int i = 1; i < len; i++){
            localSum = Math.max(A[i], localSum + A[i]);
            maxSum = Math.max(maxSum, localSum);
        }

        return maxSum;
    }
}
