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

        int time = 0;
        for(int i = 0; i < chars1.length; i++){
            if(chars1[i] == 'A' || chars1[i] == 'B' || chars1[i] == 'C'){
                time += 3;
            } else if(chars1[i] == 'D' || chars1[i] == 'E' || chars1[i] == 'F'){
                time += 4;
            } else if(chars1[i] == 'G' || chars1[i] == 'H' || chars1[i] == 'I'){
                time += 5;
            } else if(chars1[i] == 'J' || chars1[i] == 'K' || chars1[i] == 'L'){
                time += 6;
            } else if(chars1[i] == 'M' || chars1[i] == 'N' || chars1[i] == 'O'){
                time += 7;
            } else if(chars1[i] == 'P' || chars1[i] == 'Q' || chars1[i] == 'R' || chars1[i] == 'S'){
                time += 8;
            } else if(chars1[i] == 'T' || chars1[i] == 'U' || chars1[i] == 'V'){
                time += 9;
            } else {
                time += 10;
            }
        }

        bw.write(time+"");

        bw.flush();
        bw.close();
    }
}