import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static int[][] arr = new int[9][9];
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        sudoku(0, 0);

    }

    public static void sudoku(int y, int x) throws IOException{
        if(x == 9){
            sudoku(y+1, 0);
            return;
        }
        if(y == 9){
            for(int Y = 0; Y < 9; Y++){
                for(int X = 0; X < 9; X++){
                    bw.write(arr[Y][X] + " ");
                }
                bw.write("\n");
            }
            bw.flush();
            bw.close();
            System.exit(0);
        }

        if(arr[y][x] == 0){
            for(int value = 1; value <= 9; value++){
                arr[y][x] = value;
                if(checkValue(y, x)){
                    sudoku(y, x+1);
                }
                arr[y][x] = 0;
            }
        }
        else {
            sudoku(y, x+1);
        }
    }

    // 문제가 있으면 false 반환
    // 문제가 없으면 true 반환
    public static boolean checkValue(int y, int x){

        for(int Y = 0; Y < 9; Y++){
            if(Y != y){
                if(arr[Y][x] == arr[y][x]){
                    return false;
                }
            }
        }

        for(int X = 0; X < 9; X++){
            if(X != x){
                if(arr[y][X] == arr[y][x]){
                    return false;
                }
            }
        }

        int miniY = y/3*3;
        int miniX = x/3*3;
        for(int i = miniY; i < miniY+3; i++){
            for(int j = miniX; j < miniX+3; j++){
                if(y != i && x != j){
                    if(arr[y][x] == arr[i][j]){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}