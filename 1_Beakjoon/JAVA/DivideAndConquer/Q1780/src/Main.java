import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr;
    static int cntMinusOne = 0;
    static int cntPlusOne = 0;
    static int cntZero = 0;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cutting(0, 0, N);

        bw.write(cntMinusOne+"\n");
        bw.write(cntZero+"\n");
        bw.write(cntPlusOne+"\n");

        bw.flush();
        bw.close();
    }

    public static void cutting(int y, int x, int oneSide){
        if(!checkNum(y, x, oneSide)){
            cutting(y, x, oneSide/3);
            cutting(y, x+oneSide/3, oneSide/3);
            cutting(y, x+(oneSide/3)*2, oneSide/3);
            cutting(y+oneSide/3, x, oneSide/3);
            cutting(y+oneSide/3, x+oneSide/3, oneSide/3);
            cutting(y+oneSide/3, x+(oneSide/3)*2, oneSide/3);
            cutting(y+(oneSide/3)*2, x, oneSide/3);
            cutting(y+(oneSide/3)*2, x+(oneSide/3), oneSide/3);
            cutting(y+(oneSide/3)*2, x+(oneSide/3)*2, oneSide/3);
        } else {
            if(arr[y][x] == 1){
                cntPlusOne++;
            } else if(arr[y][x] == 0){
                cntZero++;
            } else {
                cntMinusOne++;
            }
        }
    }

    public static boolean checkNum(int y, int x, int oneSide){
        int originNum = arr[y][x];
        for(int Y = y; Y < y+oneSide; Y++){
            for(int X = x; X < x+oneSide; X++){
                if(originNum != arr[Y][X]){
                    return false;
                }
            }
        }
        return true;
    }

}