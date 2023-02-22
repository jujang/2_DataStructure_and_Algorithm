import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        String temp = "";

        int plusSum = 0;
        int minusSum = 0;

        boolean flag = false;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != '+' && str.charAt(i) != '-'){
                temp += str.charAt(i);
            } else {
                if(!flag){
                    plusSum += Integer.parseInt(temp);
                } else {
                    minusSum += Integer.parseInt(temp);
                }
                if(flag == false && str.charAt(i) == '-'){
                    flag = true;
                }
                temp = "";
            }
        }
        if(!flag){
            plusSum += Integer.parseInt(temp);
        } else {
            minusSum += Integer.parseInt(temp);
        }

        bw.write(plusSum-minusSum + "");

        bw.flush();
        bw.close();
    }

}