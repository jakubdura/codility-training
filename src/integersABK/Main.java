package integersABK;

public class Main {
    public static void main(String[] args) {
        solution(6,12,2);
        System.out.println(divisibleCount(6,11,2));
    }

    public static int solution(int A, int B, int K) {
        // Implement your solution here
        int result = 0;
        for (int a = A; a<=B; a++){
            if (a % K == 0){
                result++;
            }
        }
        return result;
    }
    public static int divisibleCount(int A, int B, int K) {
        return (B - A) / K + 1;
    }
}
