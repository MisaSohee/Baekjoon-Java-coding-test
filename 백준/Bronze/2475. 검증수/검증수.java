import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        String[] numStrings = number.split(" ");

        int[] num = new int[numStrings.length];

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(numStrings[i]);
        }

        int sum=0;

        for (int i = 0; i < num.length; i++) {
            int cal = num[i] * num[i];
            sum = sum+cal;
        }

        int result = sum%10;
        System.out.println(result);
    }
}