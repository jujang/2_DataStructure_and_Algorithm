import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static int N;
    static boolean[][] arr;
    static String str = "";

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        arr = new boolean[N][N];

        for(int i = 0; i < N; i++){
            String st = br.readLine();
            for(int j = 0; j < N; j++){
                int input = Integer.parseInt(Character.toString(st.charAt(j)));
                if(input == 1) {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        quadTree(0,0, N);

        bw.write(str);

        bw.flush();
        bw.close();
    }

    public static void quadTree(int y, int x, int oneSide){

        if(!checkAllSame(y, x, oneSide)){
            str += "(";
            quadTree(y, x, oneSide/2);
            quadTree(y, x + oneSide/2, oneSide/2);
            quadTree(y + oneSide/2, x, oneSide/2);
            quadTree(y + oneSide/2, x + oneSide/2, oneSide/2);
            str += ")";
        } else {
            if(arr[y][x]){
                str += "1";
            } else {
                str += "0";
            }
        }

    }

    public static boolean checkAllSame(int y, int x, int oneSide){

        boolean firstValue = arr[y][x];
        for(int Y = y; Y < y+oneSide; Y++){
            for(int X = x; X < x+oneSide; X++){
                if(firstValue != arr[Y][X]){
                    return false;
                }
            }
        }
        return true;

    }
}