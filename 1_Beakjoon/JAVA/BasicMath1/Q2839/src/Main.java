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
        int bag5 = N/5;

        while(true){
            if((N - bag5*5)%3 == 0){
                bw.write(bag5 + (N-bag5*5)/3 + "");
                break;
            } else {
                bag5--;
                if(bag5 < 0){
                    bw.write(-1+"");
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
    }
}