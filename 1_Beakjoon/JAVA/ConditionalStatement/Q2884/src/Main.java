import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        if(B>=45){
            System.out.println(A + " " + (B-45));
        } else {
            if(A == 0){
                System.out.println(23 + " " + (60 + B - 45));
            } else {
                System.out.println((A-1) + " " + (60 + B - 45));
            }
        }

        in.close();
    }
}