import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static char[][] arr;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        arr = new char[N][N];

        star(0, 0, N, false);

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                bw.write(arr[i][j] + "");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }

    public static void star(int y, int x, int oneSide, boolean okay){
        if(oneSide == 1){
            if(okay == true){
                arr[y][x] = ' ';
            } else {
                arr[y][x] = '*';
            }
            return;
        }

        int miniSide = oneSide/3;
        int cnt = 0;
        for(int Y = y; Y < y + oneSide; Y += miniSide){
            for(int X = x; X < x + oneSide; X += miniSide){
                cnt++;
                if(okay == true){
                    star(Y, X, miniSide, true);
                } else if(cnt == 5){
                    star(Y, X, miniSide, true);
                } else {
                    star(Y, X, miniSide, false);
                }
            }
        }
    }
}