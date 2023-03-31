import java.io.*;

public class Main {

    static int[] arr = new int[1_000_001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        arr[1] = 1;
        arr[2] = 2;

        int result = func(N);

        bw.write(result + "\n");

        bw.flush();
        bw.close();
    }

    public static int func(int N) {
        if(arr[N] == 0) {
            return arr[N] = (func(N-1) + func(N-2))%15746;
        } else {
            return arr[N];
        }
    }
}