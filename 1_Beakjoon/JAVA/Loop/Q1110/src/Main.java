import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int value = Integer.parseInt(br.readLine());
        int value10 = value/10;
        int value1 = value%10;

        int newValue10 = value10;
        int newValue1 = value1;
        int cnt = 0;
        while(true){
            cnt++;
            int newValue = newValue10 + newValue1;
            newValue10 = newValue1;
            newValue1 = newValue%10;
            if(value10 == newValue10 && value1 == newValue1) break;
        }

        bw.write(cnt + "\n");
        bw.flush();
        bw.close();

    }
}