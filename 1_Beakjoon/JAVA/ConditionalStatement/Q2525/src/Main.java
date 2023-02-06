import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int C_Hour = C/60;
        int C_Minute = C%60;

        if(B + C >= 60){
            if(B + C_Minute >= 60){
                System.out.println(((A + C_Hour + 1)%24) + " " + (B+C_Minute)%60);
            } else {
                System.out.println(((A + C_Hour)%24) + " " + (B+C_Minute)%60);
            }
        } else {
            System.out.println(A + " " + (B+C));
        }

        in.close();
    }
}