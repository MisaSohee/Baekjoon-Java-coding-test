import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int one = (A+B)%C;
        int two = ((A%C) + (B%C))%C;
        int three = (A*B)%C;
        int four = ((A%C)*(B%C))%C;

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
    }
}