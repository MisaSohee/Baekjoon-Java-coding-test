import java.util.Scanner;

import static java.lang.Integer.*;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int money=0;
        if (a == b && b==c && c==a) {
            money = 10000+a*1000;
        } else if (a == b || b == c) {
            money = 1000+b*100;
        } else if (a == c) {
            money = 1000 + c * 100;
        } else if (a != b && b != c && a != c) {
            if (a > b && a>c) {
                money = a*100;
            } else if (b > a && b > c) {
                money = b * 100;
            } else if (c > a && c > b) {
                money = c*100;
            }
        }

        System.out.println(money);
    }
}