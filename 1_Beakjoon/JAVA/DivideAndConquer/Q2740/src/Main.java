import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr1;
    static int[][] arr2;
    static int[][] arr3;

    static int a;
    static int b;
    static int c;
    static int d;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        arr1 = new int[a][b];

        for(int i = 0; i < a; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < b; j++){
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        arr2 = new int[c][d];

        for(int i = 0; i < c; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < d; j++){
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        arr3 = new int[a][d];

        multiple();

        for(int y = 0; y < a; y++){
            for(int x = 0; x < d; x++){
                bw.write(arr3[y][x] + " ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }

    public static void multiple(){

        for(int y = 0; y < a; y++){
            for(int x = 0; x < d; x++){
                arr3[y][x] = calc(y, x);
            }
        }

    }

    public static int calc(int y, int x){

        int sum = 0;
        int X = 0;
        for(int Y = 0; Y < c; Y++){
                sum += arr1[y][X]*arr2[X][x];
            X++;
        }
        return sum;
    }

}