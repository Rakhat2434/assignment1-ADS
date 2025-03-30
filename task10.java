//find gcd
import java.util.Scanner;

public class task10 {
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a; //  b = 0, то GCD(a, b) = a
        }
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD(" + a + ", " + b + ") = " + findGCD(a, b));
    }
}
