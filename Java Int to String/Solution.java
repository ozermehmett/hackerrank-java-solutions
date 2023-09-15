import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        try {
            String str = String.valueOf(x);
            System.out.println("Good job");
        }catch (Exception e) {
            System.out.println("Wrong answer");
        }
    }
}
