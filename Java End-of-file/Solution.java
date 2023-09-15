import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        while (scanner.hasNextLine()){
            String s = scanner.nextLine();
            System.out.println(n + " " + s);
            n++;
        }
    }
}
