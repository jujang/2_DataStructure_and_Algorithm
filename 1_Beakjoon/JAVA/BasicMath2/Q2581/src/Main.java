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

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N-M+1];

        int cnt = 0;
        int sum = 0;
        for(int i = M; i <= N; i++){
            if(i == 1) continue;
            else if(i == 2) {
                sum += i;
                arr[cnt++] = i;
            }
            else if(i%2 == 0) continue;
            else {
                int a = 3;
                int plus = 1;
                while(a < i){
                    if(i%a == 0) {
                        plus = 0;
                        break;
                    }
                    else{
                        a += 2;
                    }
                }
                arr[cnt] = i;
                if(plus == 1){
                    sum += i;
                }
                cnt += plus;
            }
        }

        if(sum == 0){
            bw.write(-1+"");
        } else {
            bw.write(sum+"\n");
            bw.write(arr[0]+"");
        }

        bw.flush();
        bw.close();
    }
}