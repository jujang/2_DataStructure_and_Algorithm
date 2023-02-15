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

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        star(N);

        bw.flush();
        bw.close();
    }

    public static void star(int N) throws IOException{
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < N; i++){
            if(i == N/2) {
                pointingEmpty(i);
            } else {
                pointingStar(i);
            }
            if((i+1)%Math.sqrt(N) == 0){
                bw.write("\n");
            }
        }

    }

    public static void pointingStar(int N) throws IOException{
//        if()
        bw.write("*");
    }

    public static void pointingEmpty(int N) throws IOException{
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(" ");
    }
}