package eatChocolate;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        solution(10, 4);
    }

    public static int solution(int N, int M) {
        // write your code in Java SE 8
        boolean[] chocolates = addChocolates(N);
        int solution = countChocolatesEaten(chocolates, N, M);
        return solution;
    }

    static boolean[] addChocolates(int n) {
        boolean[] result = new boolean[n];

        for (int i = 0; i < n; i++) {
            result[i] = true;
            System.out.println(i + " = " + result[i]);
        }
        return result;
    }

    public static int countChocolatesEaten(boolean[] chocolates, int n, int m) {
        int result = 0;
        int currentChocolate = 0;
        while (true) {
            if (chocolates[currentChocolate]) {
                chocolates[currentChocolate] = false;
                System.out.println(currentChocolate + " eating... ");
                result++;
                currentChocolate = (currentChocolate + m) % n;
            } else break;
        }
        System.out.println("Chocolates eaten: " + result);
        return result;
    }

}
