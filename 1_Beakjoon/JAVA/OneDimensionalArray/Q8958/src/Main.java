import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];


        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int score = 0;
            int continueCnt = 1;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == 'O'){
                    score += continueCnt++;
                } else {
                    continueCnt = 1;
                }
            }
            bw.write(score + "\n");
        }

        bw.flush();
        bw.close();
    }
}