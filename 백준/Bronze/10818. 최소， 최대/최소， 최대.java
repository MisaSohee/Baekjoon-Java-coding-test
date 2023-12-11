import java.util.Scanner;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int[] numbers = new int[number];

        for(int i=0; i<number; i++) {
            numbers[i] = scan.nextInt();
        }

        int max= MIN_VALUE;
        int min= MAX_VALUE;
        for (int i = 0; i < number; i++) {
            if (numbers[i]>max) {
                max = numbers[i];
            }
        }

        for (int i = 0; i < number; i++) {
            if (numbers[i]<min) {
                min = numbers[i];
            }
        }

        System.out.println(min+ "\n"+ max);

    }
}