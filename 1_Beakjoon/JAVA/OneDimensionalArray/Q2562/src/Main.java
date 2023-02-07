import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];
        int maxNum = 0;
        int maxIdx = 0;
        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] > maxNum) {
                maxNum = arr[i];
                maxIdx = i+1;
            }
        }

        bw.write(maxNum + "\n" + maxIdx);
        bw.flush();
        bw.close();
    }
}