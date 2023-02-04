package replaceArrayTask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");

        int arr[] = {1, 2, 5, 7, 8, 8, 7};
        System.out.println(Arrays.toString(arr));
        solution(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void solution(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    arr[j] = arr[j] + 1;
                }
            }
        }
    }
}
