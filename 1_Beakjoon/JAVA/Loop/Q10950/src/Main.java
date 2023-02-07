import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int[] B = new int[A];
        int[] C = new int[A];
        for(int i = 0; i < A; i++){
            B[i] = in.nextInt();
            C[i] = in.nextInt();
        }

        for(int i = 0; i < A; i ++){
            System.out.println(B[i] + C[i]);
        }

        in.close();
    }
}