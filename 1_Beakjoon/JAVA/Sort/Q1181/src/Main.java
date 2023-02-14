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
        HashSet<String> hashSet = new HashSet<>();

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            hashSet.add(str);
        }

        String[] arr = new String[hashSet.size()];
        Iterator<String> values = hashSet.iterator();
        int cnt = 0;
        while(values.hasNext()){
             arr[cnt++] = values.next();
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1.length() == e2.length()){
                return e1.compareTo(e2);
            } else {
                return e1.length() - e2.length();
            }
        });

        for(int j = 0; j < arr.length; j++){
            bw.write(arr[j] + "\n");
        }

        bw.flush();
        bw.close();
    }
}