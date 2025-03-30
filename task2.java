//average

import java.util.Scanner;

public class task2 {
    public static int sumElements(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sumElements(arr, n - 1);
    }

    public static double findAverage(int[] arr, int n) {
        return sumElements(arr, n) / (double) n; //to find avg, we should divide by quantity
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Average: " + findAverage(arr, n));
        sc.close();
    }
}
