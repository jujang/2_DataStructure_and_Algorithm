import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        boolean flag = false;
        int sum = 0;
        int index = 0;
        for(int i = 1; i < N; i++){
            sum = i + calculate(i);
            if(sum == N){
                flag = true;
                index = i;
                break;
            }
        }

        if(flag){
            bw.write(index+"");
        } else {
            bw.write(0+"");
        }

        bw.flush();
        bw.close();
    }

    public static int calculate(int x){
        if(x >= 10){
            return (x%10) + calculate(x/10);
        } else {
            return x;
        }
    }
}