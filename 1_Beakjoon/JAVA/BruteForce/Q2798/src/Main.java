import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        int targetValue = 0;
        int result = 0;
        for(int x = 0; x < N; x++){
            for(int y = x+1; y < N; y++){
                for(int z = y+1; z < N; z++){
                    targetValue = arr[x] + arr[y] + arr[z];
                    if(targetValue <= M && targetValue > result) {
                        result = targetValue;
                    }
                }
            }
        }

        bw.write(result+"");

        bw.flush();
        bw.close();
    }
}