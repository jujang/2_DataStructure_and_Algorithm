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

        String str1 = st.nextToken();
        char[] chars1 = str1.toCharArray();

        String str2 = st.nextToken();
        char[] chars2 = str2.toCharArray();


        char temp;

        temp = chars1[0];
        chars1[0] = chars1[2];
        chars1[2] = temp;

        temp = chars2[0];
        chars2[0] = chars2[2];
        chars2[2] = temp;


        int num1 = Integer.parseInt(String.valueOf(chars1));
        int num2 = Integer.parseInt(String.valueOf(chars2));

        if(num1 > num2){
            bw.write(num1+"");
        } else {
            bw.write(num2+"");
        }

        bw.flush();
        bw.close();
    }
}