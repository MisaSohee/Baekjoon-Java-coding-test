import java.util.Scanner;

import static java.lang.Integer.*;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int[] numbers = new int[number];

        for(int i=0; i<number; i++) {
            numbers[i] = scan.nextInt();
        }
        int find = scan.nextInt();

        int count=0;
        for(int i=0; i<number; i++) {
            if (numbers[i] == find) {
                count = count+1;
            }
        }
        System.out.println(count);

    }
}