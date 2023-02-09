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

        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N-M+1];

        if(M == 1) M += 1;
        if(M == 2) bw.write(M+"\n");

        if(M%2 == 0) M++;
        if(N%2 == 0) N--;
        for(int i = M; i <= N; i+=2){
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
                bw.write(i+"\n");
            }
        }

        bw.flush();
        bw.close();
    }
}