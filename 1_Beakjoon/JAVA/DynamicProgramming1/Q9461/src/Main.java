import java.io.*;

public class Main {

    static long[] arr = new long[101];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        arr[1] = 1L;
        arr[2] = 1L;
        arr[3] = 1L;
        arr[4] = 2L;
        arr[5] = 2L;

        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());
            long result = func(x);
            bw.write(result + "\n");
            bw.flush();
        }

        bw.close();
    }

    public static long func(int N) {
        if(arr[N] == 0) {
            return arr[N] = func(N-5) + func(N-1);
        } else {
            return arr[N];
        }
    }
}