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
        printingSequence(N, 0, M, inputArr);

        bw.flush();
        bw.close();
    }

    public static void printingSequence(int availableRange, int thisCnt, int availableCnt, int[] inputArr) throws IOException{
        if(thisCnt + 1 <= availableCnt){
            for(int i = 1; i <= availableRange; i++){
                inputArr[thisCnt] = i;
                printingSequence(availableRange, thisCnt+1, availableCnt, inputArr.clone());
            }
        } else {
            for(int a = 0; a < inputArr.length; a++){
                bw.write(inputArr[a] + " ");
            }
            bw.write("\n");
        }
    }

}