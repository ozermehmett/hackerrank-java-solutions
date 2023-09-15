import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        //scanner.nextLine();
        int y = scanner.nextInt();
        //scanner.nextLine();

        if (x > 0 && y > 0 && x < 100 && y < 100){
            System.out.println(x*y);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
