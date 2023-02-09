import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[100][100];

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            for(int x = startX; x < startX+10; x++){
                for(int y = startY; y < startY+10; y++){
                    arr[x][y]++;
                }
            }

        }

        int sum = 0;
        for(int x = 0; x < 100; x++){
            for(int y = 0; y < 100; y++){
                if(arr[x][y] > 0) sum++;
            }
        }

        bw.write(sum+"");

        bw.flush();
        bw.close();
    }
}