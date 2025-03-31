//reverse
import java.util.Scanner;

public class  task7 {
    public static void printReverse(int n, Scanner sc) {
        if (n == 0) {
            return;
        }
        int num = sc.nextInt();
        printReverse(n - 1, sc); // Recursively read and process the next element before printing the current one
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printReverse(n, sc);
        sc.close();
    }
}
