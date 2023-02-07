import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        String str = br.readLine();
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < str.length(); i++){
            int num = str.charAt(i) - 'a';
            if(!hashSet.contains(num)) {
                hashSet.add(num);
                arr[num] = i;
            }
        }

        for(int j = 0; j < 26; j++){
            bw.write(arr[j] + " ");
        }

        bw.flush();
        bw.close();
    }
}