import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][];
        double[] avgArr = new double[N];

        for(int i = 0; i < N; i++){
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            arr[i] = new int[num];
            for(int j = 0; j < num; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                sum += arr[i][j];
            }
            avgArr[i] = (double)sum/(double)num;
        }

        for(int i = 0; i < N; i++){
            int okNum = 0;
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > avgArr[i]) okNum++;
            }
            bw.write(String.format("%.3f", ((double)okNum/(double)arr[i].length)*(double)100) + "%\n");
        }

        bw.flush();
        bw.close();
    }
}