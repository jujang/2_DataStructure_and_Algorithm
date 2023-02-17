import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][3];
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            arr[i] = new int[]{weight, height, -1};
        }

        for(int a = 0; a < N; a++){
            int cnt = 0;
            for(int b = 0; b < N; b++){
                if(a == b) continue;
                else if(arr[a][0] < arr[b][0] && arr[a][1] < arr[b][1]){
                    cnt++;
                }
            }
            arr[a][2] = cnt;
        }

        for(int x = 0; x < N; x++){
            bw.write(arr[x][2]+1+" ");
        }

        bw.flush();
        bw.close();
    }

}