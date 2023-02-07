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

        int N = Integer.parseInt(br.readLine());
        int minNum = 1000000;
        int maxNum = -1000000;

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int num;
        for(int i = 0; i < N; i++){
            num = Integer.parseInt(st2.nextToken());
            if(num < minNum) minNum = num;
            if(num > maxNum) maxNum = num;
        }

        bw.write(minNum + " " + maxNum);
        bw.flush();
        bw.close();
    }
}