//power
import java.util.Scanner;

public class  task6 {
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1); // Multiply a by the result of a^(n-1) recursively.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int n = sc.nextInt();
        System.out.println(power(a, n));
    }
}
