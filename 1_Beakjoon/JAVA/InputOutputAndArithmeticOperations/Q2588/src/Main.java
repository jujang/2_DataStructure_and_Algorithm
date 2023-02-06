import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int B100 = B/100;
        int B10 = (B/10) - (B100*10);
        int B1 = B%10;

        System.out.println(A*B1);
        System.out.println(A*B10);
        System.out.println(A*B100);
        System.out.println(A*B);

        in.close();
    }
}