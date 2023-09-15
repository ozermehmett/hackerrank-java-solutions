import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //sc.nextLine();
            int t = 15 - s1.length();

            if (x < 10){
                System.out.println(s1  + " ".repeat(t) + "00" + x);
            }else if (x < 100){
                System.out.println(s1  + " ".repeat(t) + "0" + x);
            }else{
                System.out.println(s1 + " ".repeat(t) + x);
            }
        }
        System.out.println("================================");
    }
}
