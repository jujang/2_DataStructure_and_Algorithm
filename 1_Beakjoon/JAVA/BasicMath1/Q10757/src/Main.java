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
        String str2 = st.nextToken();

        StringBuffer buf;
        if(str1.length() > str2.length()){
            buf = new StringBuffer(str2);
            for(int i = 0; i < str1.length()-str2.length(); i++){
                buf.insert(0, "0");
            }
            str2 = buf.toString();
        } else if(str2.length() > str1.length()){
            buf = new StringBuffer(str1);
            for(int i = 0; i < str2.length()-str1.length(); i++){
                buf.insert(0, "0");
            }
            str1 = buf.toString();
        }
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int[] chars3 = new int[chars1.length+1];

        boolean flag = false;
        int a;
        for(int k = chars1.length-1;  k >= 0; k--){
            if(flag) {
                a = (chars1[k]-'0') + (chars2[k]-'0') + 1;
                flag = false;
                if(a >= 10) {
                    flag = true;
                    a = a%10;
                }
                chars3[k+1] = a;
            } else {
                a = (chars1[k]-'0') + (chars2[k]-'0');
                if(a >= 10) {
                    flag = true;
                    a = a%10;
                }
                chars3[k+1] = a;
            }
        }
        if(flag) chars3[0] = 1;

        char[] chars = new char[chars3.length];
        for(int y = 0; y < chars3.length; y++){
            chars[y] = (char)(chars3[y] + '0');
        }

        String str = String.valueOf(chars);
        while(str.charAt(0) == '0'){
            str = str.replaceFirst("0", "");
        }

        bw.write(str+"");

        bw.flush();
        bw.close();
    }
}