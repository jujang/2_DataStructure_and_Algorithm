import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static int[] inputArr;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        inputArr = new int[M];
        printingSequence(N, 0, 1, M);

        bw.flush();
        bw.close();
    }

    public static void printingSequence(int availableRange, int thisCnt, int startNum, int availableCnt) throws IOException{
        if(thisCnt + 1 <= availableCnt){
            for(int i = startNum; i <= availableRange; i++){
                inputArr[thisCnt] = i;
                printingSequence(availableRange, thisCnt+1, i, availableCnt);
            }
        } else {
            for(int a = 0; a < inputArr.length; a++){
                bw.write(inputArr[a] + " ");
            }
            bw.write("\n");
        }
    }

}