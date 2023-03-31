import java.io.*;

public class Main {

    static int[] f = new int[41];

    static int recursionNum = 0;
    static int dynamicNum = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        fib(N);
        fibonacci(N);

        bw.write(recursionNum + " " + dynamicNum);

        bw.flush();
        bw.close();
    }


    public static int fib(int n){
        if(n == 1 || n == 2){
            recursionNum++;
            return 1;
        } else {
            return fib(n-1) + fib(n -2);
        }
    }

    public static int fibonacci(int n){
        f[1] = 1;
        f[2] = 1;
        for(int i = 3; i <= n; i++){
            dynamicNum++;
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}