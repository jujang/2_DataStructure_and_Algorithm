import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int[] C = new int[B];
        int[] D = new int[B];
        for(int i = 0; i < B; i++){
            C[i] = in.nextInt();
            D[i] = in.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < B; i ++){
            sum += (C[i]*D[i]);
        }

        if(sum == A) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        in.close();
    }
}