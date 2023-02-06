import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int King = in.nextInt();
        int Queen = in.nextInt();
        int Rook = in.nextInt();
        int Bishop = in.nextInt();
        int Knight = in.nextInt();
        int Pawn = in.nextInt();

        System.out.print(1 - King + " ");
        System.out.print(1 - Queen + " ");
        System.out.print(2 - Rook + " ");
        System.out.print(2 - Bishop + " ");
        System.out.print(2 - Knight + " ");
        System.out.print(8 - Pawn);

        in.close();
    }
}