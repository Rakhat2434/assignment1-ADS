//find factorial
import java.util.Scanner;

public class task4 {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1); // Multiply `n` by the factorial of `n-1` recursively.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial: " + factorial(n));
    }
}
