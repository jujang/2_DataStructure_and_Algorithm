import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String result = "";

        for(int i = 0; i < chars.length; i++){
            result += chars[chars.length-1-i];
        }

        bw.write(result);

        bw.flush();
        bw.close();
    }
}