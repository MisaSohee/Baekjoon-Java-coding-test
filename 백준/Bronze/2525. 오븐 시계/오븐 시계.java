import java.util.Scanner;

import static java.lang.Integer.*;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int hour = scan.nextInt();
        int m = scan.nextInt();
        int cook = scan.nextInt();

        int minute=m+cook;
        int hour2 = (minute/60)+hour;

        if (minute < 60) {
            System.out.println(hour+" "+minute);
        } else if ( hour2>=24 && minute>=60) {
            hour=hour+(minute/60)-24;
            minute = minute%60;
            System.out.println(hour+" "+minute);
        } else {
            hour=hour+(minute/60);
            minute = minute%60;
            System.out.println(hour+" "+minute);
        }
    }
}