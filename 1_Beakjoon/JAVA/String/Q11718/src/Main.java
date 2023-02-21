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

        String[] strArr = new String[100];
        int cnt = 0;
        while(true){
            String str = br.readLine();
            if(str != null){
                strArr[cnt++] = str;
            } else {
                break;
            }
        }

        for(int i = 0; i < cnt; i++){
            bw.write(strArr[i] + "\n");
        }

        bw.flush();
        bw.close();
    }
}