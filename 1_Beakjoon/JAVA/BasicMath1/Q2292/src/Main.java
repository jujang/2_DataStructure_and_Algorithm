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

        if(a == 1) bw.write(1+"");
        else {
            a-=1;
            int cnt = 0;
            while(true){
                cnt++;
                if(a > cnt*6) {
                    a -= (cnt*6);
                    continue;
                }
                else {
                    bw.write((cnt+1)+"");
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
    }
}