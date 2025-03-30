// find prime
import java.util.Scanner;

public class task3 {
    public static boolean isPrimeRecursive(int n, int divisor) {
        if (n < 2) return false; // 0 , 1 not prime
        if (divisor * divisor > n) return true; // √n is prime.
        if (n % divisor == 0) return false; // not prime
        return isPrimeRecursive(n, divisor + 1);
    }

    public static boolean isPrime(int n) {
        return isPrimeRecursive(n, 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        sc.close();
    }
}
