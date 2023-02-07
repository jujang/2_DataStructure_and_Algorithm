import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < 10; i++){
            int num = Integer.parseInt(br.readLine())%42;
            if(!hashSet.contains(num)){
                hashSet.add(num);
            }
        }
        bw.write(hashSet.size() + "\n");
        bw.flush();
        bw.close();
    }
}