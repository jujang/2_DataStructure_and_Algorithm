import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static int cnt = 0;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());
//        int[] arr = new int[N+1];
//        MenOfPassion(arr, N);

        bw.write((N*(N-1))/2 + "\n" + 2);

        bw.flush();
        bw.close();
    }

    public static int MenOfPassion(int[] A, int n){
        int sum = 0;
        for(int i = 1; i < n; i++){
            for(int j = i+1; j <= n; j++){
                cnt++;
                sum += A[i]*A[j];
            }
        }
        return sum;
    }
}