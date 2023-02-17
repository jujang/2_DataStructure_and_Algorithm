import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        String str = "666";
        for(int i = 0; i < 2147483647; i++){
            if(String.valueOf(i).contains(str)){
                cnt++;
                if(cnt == N) {
                    bw.write(i + "");
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
    }
}