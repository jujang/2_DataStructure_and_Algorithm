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
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int prevReach = V - A;
        if(prevReach == 0) {
            bw.write(1+"");
        } else {
            int plus = 1;
            int day = prevReach/(A-B);
            if(prevReach%(A-B) != 0) plus++;
            bw.write((day+plus)+"");
        }

        bw.flush();
        bw.close();
    }
}