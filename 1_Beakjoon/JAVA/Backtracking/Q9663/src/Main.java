import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static int[] arr;
    static int N;
    static int result = 0;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        arr = new int[N];

        nQueen(0);

        bw.write(result + "");

        bw.flush();
        bw.close();
    }

    public static void nQueen(int manCnt){
        if(manCnt == N){
            result++;
            return;
        }

        for(int i = 0; i < N; i++){
            arr[manCnt] = i;
            if(checkPossible(manCnt)){
                nQueen(manCnt+1);
            }
            arr[manCnt] = 0;
        }
    }

    public static boolean checkPossible(int thisFloor){
        for(int i = 0;  i < thisFloor; i++){
            if(arr[i] == arr[thisFloor]){
                return false;
            }

            int yDiff = Math.abs(arr[i] - arr[thisFloor]);
            int xDiff = Math.abs(i - thisFloor);
            if(yDiff == xDiff){
                return false;
            }
        }
        return true;
    }
}