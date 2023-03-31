import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] arr;
    static int[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = func();

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

    public static int func(){
        dp[0] = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
            max = Math.max(max, dp[i]);
        }

        return max;
    }

    // 시간이 너무 오래걸리고, dp가 아닌 brute force 방법...
//    public static int func(){
//
//        for(int i = 0; i < arr.length; i++){
//            int temp = arr[i];
//            dp[i] = temp;
//            for(int j = i+1; j < arr.length; j++){
//                  temp += arr[j];
//                  if(temp > dp[i]){
//                      dp[i] = temp;
//                  }
//            }
//        }
//
//        int maxSum = dp[0];
//        for(int i = 1; i < dp.length; i++){
//            if(maxSum < dp[i]) maxSum = dp[i];
//        }
//
//        return maxSum;
//    }
}