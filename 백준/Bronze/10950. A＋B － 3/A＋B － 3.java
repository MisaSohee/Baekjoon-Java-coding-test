import java.util.Scanner;

import static java.lang.Integer.*;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a+b);
        }

    }
}