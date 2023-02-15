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

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int[] cnt = new int[1];
            bw.write(isPalindrome(str, cnt) + " " + cnt[0] + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static int recursion(String s, int l, int r, int[] cnt){
        cnt[0]++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1, cnt);
    }
    public static int isPalindrome(String s, int[] cnt){
        return recursion(s, 0, s.length()-1, cnt);
    }
}