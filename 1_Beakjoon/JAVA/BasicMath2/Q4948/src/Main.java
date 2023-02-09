import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            int cnt = 0;
            int N = Integer.parseInt(br.readLine());
            if(N == 0) break;
            else {
                if(N == 1 || N == 2) cnt = 1;
                else {
                    for(int i = N+1; i <= 2*N; i++){
                        if(i%2 == 0) continue;
                        int a = 3;
                        int plus = 1;
                        while(a <= Math.sqrt(i)){
                            if(i%a == 0) {
                                plus = 0;
                                break;
                            }
                            else{
                                a += 2;
                            }
                        }
                        if(plus == 1){
                            cnt++;
                        }
                    }
                }
            }
            bw.write(cnt+"\n");
        }

        bw.flush();
        bw.close();
    }
}