import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] distance = new int[N-1];
        int[] point = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N-1; i++){
            distance[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int j = 0; j < N; j++){
            point[j] = Integer.parseInt(st.nextToken());
        }

        int lowPoint = point[0];
        for(int i = 0; i < N-1; i++){
            if(lowPoint > point[i]){
                lowPoint = point[i];
            } else {
                point[i] = lowPoint;
            }
        }

        long sum = 0;
        for(int n = 0; n < N-1; n++){
            sum += (long)point[n]*distance[n];
        }

        bw.write(sum+"");

        bw.flush();
        bw.close();
    }

}