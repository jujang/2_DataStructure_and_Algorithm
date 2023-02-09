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
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = 0;
        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(st.nextToken());
            if(x == 1) continue;
            else if(x == 2) cnt++;
            else if(x%2 == 0) continue;
            else {
                int a = 3;
                int plus = 1;
                while(a < x){
                    if(x%a == 0) {
                        plus = 0;
                        break;
                    }
                    else{
                        a += 2;
                    }
                }
                cnt += plus;
            }
        }
        bw.write(cnt+"");

        bw.flush();
        bw.close();
    }
}