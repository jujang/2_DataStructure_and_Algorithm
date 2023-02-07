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

        StringTokenizer st;

        for(int i = 0; i < N; i++){
            for(int k = N-1; k > i; k--){
                bw.write(" ");
            }
            for(int j = 0; j <= i; j++){

                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();

    }
}