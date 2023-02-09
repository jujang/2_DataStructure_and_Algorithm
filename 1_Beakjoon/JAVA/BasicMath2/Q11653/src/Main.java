import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        if(N == 1) {
        } else {
            int cnt = 0;
            for(int i = 2; i <= N; i++){
                while(true){
                    if(N%i == 0){
                        arr[cnt++] = i;
                        N = N/i;
                    }
                    else break;
                }
            }
        }

        for(int j = 0; j < arr.length; j++){
            if(arr[j] == 0) break;
            else{
                bw.write(arr[j]+"\n");
            }
        }

        bw.flush();
        bw.close();
    }
}