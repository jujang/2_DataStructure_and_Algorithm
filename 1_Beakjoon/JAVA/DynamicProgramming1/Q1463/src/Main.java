import java.io.*;

public class Main {

    static Integer[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        dp = new Integer[N+1];

        dp[0] = 0;
        dp[1] = 0;

        for(int i = 1; i <= N; i++)
            func(i);

        Integer result = func(N);

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

    public static int func(int n){

        if(dp[n] == null) {
            if(n % 6 == 0) {
                dp[n] = Math.min(func(n/3), Math.min(func(n/2), func(n-1))) + 1;
            } else if (n % 3 == 0){
                dp[n] = Math.min(func(n/3), func(n-1)) + 1;
            } else if (n % 2 == 0){
                dp[n] = Math.min(func(n/2), func(n-1)) + 1;
            } else {
                dp[n] = func(n-1) + 1;
            }
        }
        return dp[n];
    }

}