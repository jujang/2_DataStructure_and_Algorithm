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
        arr = new int[N][3];
        dp = new int[N][3];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        int result = func();

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

    public static int func(){
        for(int i = 1; i < N; i++){
            dp[i][0] = Math.min(dp[i-1][1] + arr[i][0], dp[i-1][2] + arr[i][0]);
            dp[i][1] = Math.min(dp[i-1][0] + arr[i][1], dp[i-1][2] + arr[i][1]);
            dp[i][2] = Math.min(dp[i-1][0] + arr[i][2], dp[i-1][1] + arr[i][2]);
        }

        return Math.min(dp[N-1][0], Math.min(dp[N-1][1], dp[N-1][2]));
    }

}