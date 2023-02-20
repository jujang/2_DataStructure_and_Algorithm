import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static int[][] arr;
    static int N;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        for(int y = 0; y < N; y++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int x = 0; x < N; x++){
                arr[y][x] = Integer.parseInt(st.nextToken());
            }
        }


        bw.flush();
        bw.close();
    }

}