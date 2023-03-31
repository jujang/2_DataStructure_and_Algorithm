import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[N+1];
        Integer[] dp = new Integer[N+1];

        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        if(N == 1){
            bw.write(arr[1] + "\n");
        } else if (N == 2) {
            bw.write(arr[1] + arr[2] + "\n");
        } else {
            dp[0] = 0;
            dp[1] = arr[1];
            dp[2] = arr[1] + arr[2];

            for(int i = 3; i <= N; i++) {
                dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + arr[i], dp[i-3] + arr[i-1] + arr[i]));
            }
            bw.write(dp[N] + "\n");
        }

        bw.flush();
        bw.close();
    }
}