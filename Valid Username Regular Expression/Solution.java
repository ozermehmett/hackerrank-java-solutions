import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String username = scanner.nextLine();
            if (isValidUsername(username)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }

    private static boolean isValidUsername(String username) {
        String regex = "^[a-zA-Z]\\w{7,29}$";
        return username.matches(regex);
    }
}
