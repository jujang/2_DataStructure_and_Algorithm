import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static int[] arr = new int[11];
    static int[] operations = new int[4];
    static int[] unusedOperations = new int[4];
    static int N;

    static int maxResult = -10_0000_0000;
    static int minResult = 10_0000_0000;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int j = 0; j < 4; j++){
            operations[j] = Integer.parseInt(st.nextToken());
        }

//        availableCase(0, 0, 0, 0, 0, arr[0]);
        availableCase(unusedOperations, 0, arr[0]);

        bw.write(maxResult + "\n");
        bw.write(minResult + "\n");

        bw.flush();
        bw.close();
    }

//    public static void availableCase(int plus, int subtract, int multiple, int divide, int usedOperationCnt, int result){
    public static void availableCase(int[] unusedOperations, int usedOperationCnt, int result){
        if(usedOperationCnt == N-1){
            if(result > maxResult) maxResult = result;
            if(result < minResult) minResult = result;
            return;
        }
        for(int i = 0; i < 4; i++){
            int newResult;
            switch(i){
                case 0:
                    newResult = result + arr[usedOperationCnt+1];
                    break;
                case 1:
                    newResult = result - arr[usedOperationCnt+1];
                    break;
                case 2:
                    newResult = result * arr[usedOperationCnt+1];
                    break;
                case 3:
                    newResult = result / arr[usedOperationCnt+1];
                    break;
                default:
                    newResult = 0;
                    break;
            }
            if(operations[i] > unusedOperations[i]) {
                unusedOperations[i]++;
                availableCase(unusedOperations, usedOperationCnt+1, newResult);
                unusedOperations[i]--;
            }
        }
    }
}