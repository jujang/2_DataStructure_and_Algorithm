import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        String[] strArr = str.split(" ");

        int cnt = 0;

        if(strArr.length == 0){
            bw.write("0");
        } else {
            if(strArr[0].length() == 0) cnt++;
            if(strArr.length != 1 && strArr[strArr.length-1] == "") cnt++;
            bw.write((strArr.length-cnt)+"");
        }

        bw.flush();
        bw.close();
    }
}