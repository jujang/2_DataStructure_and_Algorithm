import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        boolean oddFlag = false;

        int cnt = 0;
        while(true){
            cnt++;
            if(a > cnt) {
                a -= cnt;
                continue;
            }
            else {
                if(cnt%2 == 0) oddFlag = true;
                int rest = a;
                if(oddFlag == true) {
                    bw.write(rest + "/" + (cnt-rest+1));
                } else {
                    bw.write((cnt-rest+1) + "/" + rest);
                }
                break;
            }
        }

        bw.flush();
        bw.close();
    }
}