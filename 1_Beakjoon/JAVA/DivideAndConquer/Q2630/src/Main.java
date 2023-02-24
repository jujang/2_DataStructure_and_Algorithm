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
    static int[][] arr;
    static int whiteCnt = 0;
    static int blueCnt = 0;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cutting(0, 0, N);

        bw.write(whiteCnt + "\n");
        bw.write(blueCnt + "\n");

        bw.flush();
        bw.close();
    }

    public static void cutting(int y, int x, int oneSide){

        if(!checkColor(y, x, oneSide)){
            cutting(y, x, oneSide/2);
            cutting(y, x+oneSide/2, oneSide/2);
            cutting(y+oneSide/2, x, oneSide/2);
            cutting(y+oneSide/2, x+oneSide/2, oneSide/2);
        } else {
            if(arr[y][x] == 1){
                blueCnt++;
            } else {
                whiteCnt++;
            }
        }

    }

    public static boolean checkColor(int y, int x, int oneSide){

        int originColor = arr[y][x];
        for(int Y = y; Y < y + oneSide; Y++){
            for(int X = x; X < x + oneSide; X++){
                if(arr[Y][X] != originColor){
                    return false;
                }
            }
        }
        return true;
    }

}