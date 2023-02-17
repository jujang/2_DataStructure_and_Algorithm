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

    static char[][] sampleArr = {
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
    };
    static char[][] arr;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new char[N][M];

        for(int i = 0; i < N; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            String str = st2.nextToken();
            for(int j = 0; j < M; j++){
                arr[i][j] = str.charAt(j);
            }
        }


        int sameCnt = 0;
        int minDiff = 32;

        for(int y = 0; y <= N-8; y++){
            for(int x = 0; x <= M-8; x++){
                for(int a = y; a < y+8; a++){
                    for(int b = x; b < x+8; b++){
                        if(arr[a][b] == sampleArr[a-y][b-x]){
                            sameCnt++;
                        }
                    }
                }
                int min = Math.min(64 - sameCnt, sameCnt);
                if(minDiff > min) {
                    minDiff = min;
                }
                sameCnt = 0;
            }
        }

        bw.write(minDiff+"");

        bw.flush();
        bw.close();
    }
}