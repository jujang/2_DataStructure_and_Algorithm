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
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N+1];
        for(int a = 1; a <= N; a++){
            arr[a] = a;
        }

        for(int b = 0; b < M; b++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[] tempArr = arr.clone();
            int kPlus = i;
            int iPlus = k;
            int moveTo = i + (j-k) + 1;
            for(int c = 1; c <= N; c++){
                if(c >= i && c <= j){
                    if(c >= moveTo) {
                        arr[c] = tempArr[kPlus++];
                    } else {
                        arr[c] = tempArr[iPlus++];
                    }
                }
            }
        }

        for(int x = 1; x <= N; x++){
            bw.write(arr[x] + " ");
        }

        bw.flush();
        bw.close();
    }
}