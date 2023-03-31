import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[][][] arr = new int[101][101][101];

    public static void main(String[] args) throws IOException {

        for(int i = 0; i <= 100; i++){
            for(int j = 0; j <= 100; j++){
                for(int k = 0; k <= 100; k++){
                    arr[i][j][k] = -100;
                }
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[3];

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < 3; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            if(arr[0] == -1 && arr[1] == -1 && arr[2] == -1){
                break;
            }

            int result = func(arr[0]+50, arr[1]+50, arr[2]+50);
            bw.write("w(" + arr[0] + ", " + arr[1] + ", " + arr[2] + ") = " + result + "\n");

            bw.flush();
        }

        bw.close();
    }

    public static int func(int a, int b, int c){

        if(arr[a][b][c] == -100){
            if(a <= 50 || b <= 50 || c <= 50){
                return 1;
            } else if (a > 70 || b > 70 || c > 70){
                return arr[a][b][c] = func(70, 70, 70);
            } else if (a < b && b < c){
                return arr[a][b][c] = func(a, b, c-1) + func(a, b-1, c-1) - func(a, b-1, c);
            } else {
                return arr[a][b][c] = func(a-1, b, c) + func(a-1, b-1, c) + func(a-1, b, c-1) - func(a-1, b-1, c-1);
            }
        }
        else {
            return arr[a][b][c];
        }
    }

}