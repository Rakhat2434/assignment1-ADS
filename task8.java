import java.util.Scanner;

//digit
public class  task8 {
    public static String isAllDigits(String s, int index) {
        if (index == s.length()) {
            return "YES";
        }
        if (!Character.isDigit(s.charAt(index))) {
            return "NO";
        }
        return isAllDigits(s, index + 1);
    }

    public static String isAllDigits(String s) {
        if (s.isEmpty()) return "NO";
        return isAllDigits(s, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(isAllDigits(s));

    }
}
