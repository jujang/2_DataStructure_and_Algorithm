import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static long cnt = 0;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int C = Integer.parseInt(br.readLine());

        int N = Integer.parseInt(br.readLine());

        int f1 = (A*N + B);
        int g1 = (C*N);
        int f2 = (A*(N+1) + B);
        int g2 = (C*(N+1));

        int a1 = g1 - f1;
        int a2 = g2 - f2;

        if((a2 >= a1) && (f1 <= g1)) {
            bw.write(1+"");
        } else {
            bw.write(0+"");
        }

        bw.flush();
        bw.close();
    }

}