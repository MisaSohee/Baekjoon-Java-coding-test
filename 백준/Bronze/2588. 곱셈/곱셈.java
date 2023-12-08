import java.util.Scanner;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String  a = scan.next();
        String  b = scan.next();
        
        String[] two = b.split("");

        int three = parseInt(a) * parseInt(two[2]);
        int four = parseInt(a) * parseInt(two[1]);
        int five = parseInt(a) * parseInt(two[0]);
        int six = parseInt(a) * parseInt(b);

        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
    }
}