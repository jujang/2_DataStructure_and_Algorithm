import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int moveCnt = (int)Math.pow(2, N) - 1;
        bw.write(moveCnt + "\n");

        hanoi(N, 1, 2, 3);

        bw.flush();
        bw.close();
    }

    public static void hanoi(int N, int start, int middle, int goal) throws IOException{
        if(N == 1) {
            bw.write(start + " " + goal + "\n");
        }
        else {
            hanoi(N-1, start, goal, middle);

            bw.write(start + " " + goal + "\n");

            hanoi(N-1, middle, start, goal);
        }
    }

}