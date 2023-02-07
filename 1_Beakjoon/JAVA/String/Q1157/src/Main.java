import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = (br.readLine()).toUpperCase();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            char alphabet = str.charAt(i);
            if(!hashMap.containsKey(alphabet)){
                hashMap.put(alphabet, 1);
            } else {
                hashMap.replace(alphabet, hashMap.get(alphabet)+1);
            }
        }

        Iterator<Character> keys = hashMap.keySet().iterator();

        char maxx = keys.next();
        int maxn = hashMap.get(maxx);

        while(keys.hasNext()){
            char x = keys.next();
            int n = hashMap.get(x);
            if(n > maxn) {
                maxx = x;
                maxn = n;
            }
        }

        Iterator<Character> keys2 = hashMap.keySet().iterator();
        int cnt = 0;
        while(keys2.hasNext()){
            int a = hashMap.get(keys2.next());
            int b = hashMap.get(maxx);
            if(a == b) cnt++;
        }

        if(cnt >= 2) bw.write("?");
        else {
            bw.write(maxx+"");
        }

        bw.flush();
        bw.close();
    }
}