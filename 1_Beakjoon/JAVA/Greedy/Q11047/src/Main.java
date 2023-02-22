import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;
    static int cnt;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int targetPrice = Integer.parseInt(st.nextToken());

        arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int index = arr.length-1;
        while(true){
            if(targetPrice == 0 || index < 0){
                break;
            }
            if(targetPrice < arr[index]){
                index--;
            } else {
                cnt += targetPrice/arr[index];
                targetPrice = targetPrice%arr[index];
                index--;
            }
        }

        bw.write(cnt+"");

        bw.flush();
        bw.close();
    }

}