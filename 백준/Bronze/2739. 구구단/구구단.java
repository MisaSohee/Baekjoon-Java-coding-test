import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] result = new int[10];
        for (int i = 1; i <= 9; i++) {
            result[i] =n*i;
        }

        for (int i =1 ; i<=9; i++) {
            System.out.print(n + " * " + i + " = " + result[i]);
            System.out.println();
        }
    }
}