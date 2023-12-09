import java.util.Scanner;

import static java.lang.Integer.*;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int h = scan.nextInt();
        int m = scan.nextInt();

        if (m >= 45) {
            System.out.println(h + " " + (m-45));
        } else if (h==0 && m<45) {
            System.out.println(23+" "+(60 - (45 - m)));
        } else if (m<45){
            System.out.println((h - 1) + " " + (60 - (45 - m)));
        }
    }
}