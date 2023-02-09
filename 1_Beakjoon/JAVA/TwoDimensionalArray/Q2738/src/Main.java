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

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[][] arr1 = new int[M][N];
        int[][] arr2 = new int[M][N];
        int[][] sumArr = new int[M][N];

        for(int i = 0; i < M; i++){
            StringTokenizer matrix1 = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr1[i][j] = Integer.parseInt(matrix1.nextToken());
            }
        }
        for(int x = 0; x < M; x++){
            StringTokenizer matrix2 = new StringTokenizer(br.readLine());
            for(int y = 0; y < N; y++){
                arr2[x][y] = Integer.parseInt(matrix2.nextToken());
            }
        }

        for(int a = 0; a < M; a++){
            for(int b = 0; b < N; b++){
                sumArr[a][b] = arr1[a][b] + arr2[a][b];
                bw.write(sumArr[a][b] + " ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}