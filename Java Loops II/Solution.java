import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int y = 0;
            for (int j = 0; j < n; j++){
                int x = b * (int)Math.pow(2, j);
                y += x;
                System.out.print((a + y) + " ");
            }
            System.out.println("");


        }
        in.close();
    }
}
