import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int M;
    static int[] arrSum;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arrSum = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(i == 0){
                arrSum[i] = temp;
            } else {
                arrSum[i] = arrSum[i-1] + temp;
            }
        }

        for(int j = 0; j < M; j++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(y == 1){
                bw.write(arrSum[0] + "\n");
            } else if (x == 1) {
                bw.write(arrSum[y-1] + "\n");
            } else {
                bw.write(arrSum[(y-1)] - arrSum[(x-1)-1] + "\n");
            }
        }

        bw.flush();
        bw.close();
    }


}