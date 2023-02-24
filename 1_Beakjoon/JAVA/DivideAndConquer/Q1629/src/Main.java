import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int A;
    static int B;
    static int C;
    static int firstNum = 1;
    static int result;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        firstNum = (A*A)%C;

        bw.write(divide()+"\n");
        bw.write("origin: " + origin());
        bw.flush();
        bw.close();
    }

    public static int divide(){

        int sum = A;
        int cnt = 0;
        while(true){
            cnt++;
            sum = (sum*A)%C;
            if(cnt != 1 && sum == firstNum){
                break;
            }
        }
        System.out.println(cnt);
        int routine = cnt - 1;
        int remain = B%routine;
        if(remain == 0) {
            remain = routine;
        }
        System.out.println("remain : " + remain);
        sum = 1;
        for(int i = 0; i < remain; i++){
            sum = (sum*A)%C;
        }

        return sum;
    }

    public static int origin(){
        int result = 1;

        for(int i = 0; i < B; i++){
            result = (result*A)%C;
        }
        return result;
    }

}