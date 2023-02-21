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
        String[] arr = new String[N];

        int cnt = N-1;
        for(int i = 0; i < N; i++){
            arr[i] = "";
            for(int j = 0; j < N + (N-1); j++){
                if(j+1 > N + (N - 1) - cnt){

                } else if(j+1 > cnt) {
                    arr[i] += "*";
                } else {
                    arr[i] += " ";
                }
            }
            cnt--;
        }

        for(int i = 0; i < N; i++){
            bw.write(arr[i] + "\n");
        }
        for(int j = N-1-1; j >= 0; j--){
            bw.write(arr[j] + "\n");
        }

        bw.flush();
        bw.close();
    }
}