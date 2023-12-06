import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long N = scan.nextInt();
        long M = scan.nextInt();

        long result = N-M;
        long minus=0;

        if(result>=0) {
            minus=result;
        }
        else {
            minus = result*-1;
        }

        System.out.println(minus);
    }
}