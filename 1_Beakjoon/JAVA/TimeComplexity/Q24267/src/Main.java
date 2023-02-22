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

        long N = Long.parseLong(br.readLine());
        long[] arr = new long[(int)(N+1)];

//        MenOfPassion(arr, N);

        bw.write((N*(N-1)*(N-2))/6 + "\n" + 3);

        bw.flush();
        bw.close();
    }

    public static long MenOfPassion(long[] A, long n){
        long sum = 0;
        for(int i = 1; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k <= n; k++){
                    cnt++;
                    sum += A[i]*A[j]*A[k];
                }
            }
        }
        return sum;
    }
}