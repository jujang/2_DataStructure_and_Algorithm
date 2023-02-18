import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] inputArr = new int[M];
        boolean[] checkArr = new boolean[N];
        printingSequence(N, 0, M, checkArr, inputArr);

        bw.flush();
        bw.close();
    }

    public static void printingSequence(int availableRange, int thisCnt, int availableCnt, boolean[] checkArr, int[] inputArr) throws IOException{
        if(thisCnt + 1 <= availableCnt){
            for(int i = 1; i <= availableRange; i++){
                if(!checkArr[i-1]){
                    inputArr[thisCnt] = i;
                    checkArr[i-1] = true;
                    printingSequence(availableRange, thisCnt+1, availableCnt, checkArr.clone(), inputArr.clone());
                }
            }
        } else {
            for(int a = 0; a < inputArr.length; a++){
                bw.write(inputArr[a] + " ");
            }
            bw.write("\n");
        }
    }

}