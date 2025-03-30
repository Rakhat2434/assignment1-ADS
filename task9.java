//find binom
import java.util.Scanner;

public class task9 {
    public static int binomialCoeff(int n, int k) {
        if (k == 0 || k == n) {
            return 1; //  C(n, 0) = C(n, n) = 1
        }
        return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println("C(" + n + ", " + k + ") = " + binomialCoeff(n, k));
    }
}
