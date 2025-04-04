// find min
import java.util.Scanner;

public class task1 {
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], findMin(arr, n - 1)); //find min
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) { //fill arr
            arr[i] = sc.nextInt();
        }
        System.out.println("Min: " + findMin(arr, n));
        sc.close();
    }
}
