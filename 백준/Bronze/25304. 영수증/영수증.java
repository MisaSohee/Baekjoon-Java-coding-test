import java.util.Scanner;

import static java.lang.Integer.*;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long receiptsum = scan.nextInt();
        long receiptvariety = scan.nextInt();

        long projectsum=0;
        for (int i = 0; i < receiptvariety; i++) {
            long projectprice = scan.nextInt();
            long projectcount = scan.nextInt();
            projectsum = projectsum+ projectprice*projectcount;
        }

        if (projectsum == receiptsum) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


    }
}