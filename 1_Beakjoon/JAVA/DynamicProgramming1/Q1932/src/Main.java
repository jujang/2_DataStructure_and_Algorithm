import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] arr;
    static int[][] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        dp = new int[N][N];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j <= i; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = arr[0][0];

        int result = func();

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

    public static int func(){

        int maxSum = dp[0][0];
        for(int i = 1; i < N; i++){
            dp[i][0] = dp[i-1][0] + arr[i][0];
            for(int j = 1; j < i; j++){
                dp[i][j] = Math.max(dp[i-1][j-1] + arr[i][j], dp[i-1][j] + arr[i][j]);
            }
            dp[i][i] = dp[i-1][i-1] + arr[i][i];
        }

        for(int i = 0; i < N; i++){
            if(maxSum < dp[N-1][i]) maxSum = dp[N-1][i];
        }

        return maxSum;
    }

}