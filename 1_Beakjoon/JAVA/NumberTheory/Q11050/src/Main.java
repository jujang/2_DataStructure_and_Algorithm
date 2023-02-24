import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int K;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int N_K = N-K;
        if(N_K > K){
            int temp = N_K;
            N_K = K;
            K = temp;
        }

        int result = 1;
        for(int i = N; i > K; i--){
            result = (result*i);
        }

        for(int j = N_K; j > 0; j--){
            result = (result/j);
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
    }


}