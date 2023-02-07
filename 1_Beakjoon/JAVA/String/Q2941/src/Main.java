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

        String str = st.nextToken() + "  ";
        char[] chars = str.toCharArray();

        int cnt = 0;
        for(int i = 0; i < chars.length-2; i++){
            if(chars[i] == 'c' || chars[i] == 'd' || chars[i] == 'l' || chars[i] == 'n' || chars[i] == 's' || chars[i] == 'z'){
                if(chars[i] == 'c' && (chars[i+1] == '=' || chars[i+1] == '-')) {
                    cnt++;
                    i += 1;
                } else if(chars[i] == 'd' && chars[i+1] == '-'){
                    cnt++;
                    i += 1;
                } else if(chars[i] == 'd' && chars[i+1] == 'z' && chars[i+2] == '='){
                    cnt++;
                    i += 2;
                } else if(chars[i] == 'l' && chars[i+1] == 'j'){
                    cnt++;
                    i += 1;
                } else if(chars[i] == 'n' && chars[i+1] == 'j'){
                    cnt++;
                    i += 1;
                } else if(chars[i] == 's' && chars[i+1] == '='){
                    cnt++;
                    i += 1;
                } else if(chars[i] == 'z' && chars[i+1] == '='){
                    cnt++;
                    i += 1;
                } else {
                    cnt++;
                }
            } else {
                cnt++;
            }
        }
        bw.write(cnt+"");

        bw.flush();
        bw.close();
    }
}