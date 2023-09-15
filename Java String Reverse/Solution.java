import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b = "";
        for (int i = a.length(); i > 0; i--){
            b += a.charAt(i-1);
        }
        if (b.equals(a)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}



