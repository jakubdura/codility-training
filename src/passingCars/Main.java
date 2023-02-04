package passingCars;

public class Main {
    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1, 1};

        System.out.println("solution:" + solution(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int pairs = 0;
        int length = A.length;

        for (int i = 0; i < length; i++) {
            if (A[i] == 0) {
                for (int j = i; j < length - 1; j++) {
                    if (A[j + 1] == 1) pairs++;
                    if (pairs >= 1000000000) return -1;
                }
            }
        }

        return pairs;
    }
}
