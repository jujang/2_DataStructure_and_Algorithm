import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int S = 1_000_000_007;
    static int N;
    static int K;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int N_K = N-K;
        if(K < N_K){
            int temp = K;
            K = N_K;
            N_K = temp;
        }
        int result = 1;
        for(int i = N; i > K; i--){
            result = result*i;
        }

        int multiple = 1;
        for(int j = 1; j <= N_K; j++){
            multiple = multiple*j;
        }

        long sol;
        if(multiple == 0) {
            sol = (long)result/(long)multiple;
        }

        if((long)result/(long)multiple < S){
            sol = (long)result/(long)multiple;
        } else {
            sol = ((long)result/(long)multiple)%(long)S;
        }

        bw.write(sol+"");

        bw.flush();
        bw.close();
    }


}