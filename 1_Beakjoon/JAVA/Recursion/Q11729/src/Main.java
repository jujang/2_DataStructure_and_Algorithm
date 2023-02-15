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

//        int[] a = new int[N];
//        int[] s = new int[N];

        int result = calculateS(N);

        bw.write(result+"");
        bw.flush();
        bw.close();
    }

    public static int calculateS(int n){
        if(n == 1){
            return 1;
        }
        return calculateS(n-1)*2 + 1;
    }

}