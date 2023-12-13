import java.util.Scanner;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        int x = scan.nextInt();

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] < x) {
                System.out.print(a[i]+" ");
            }
        }

    }
}