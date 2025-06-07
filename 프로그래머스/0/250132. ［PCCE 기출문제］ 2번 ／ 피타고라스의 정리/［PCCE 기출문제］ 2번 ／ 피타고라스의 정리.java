import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (c*c) - (a*a); //Math.pow(c) 가 아니라 (c,2) 주의, Math.pow는 double 타입 

        System.out.println(b_square);
    }
}