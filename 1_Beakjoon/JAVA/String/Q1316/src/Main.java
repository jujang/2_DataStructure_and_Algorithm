import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int result = 0;
        for(int i = 0; i < N; i++){
            int[] arr = new int[26];
            String str = br.readLine();
            char[] chars = str.toCharArray();

            char currAlphabet = chars[0];
            arr[currAlphabet - 'a'] = 1;
            for(int j = 1; j < chars.length; j++){
                if(chars[j] == currAlphabet) {
                    continue;
                } else if(chars[j] != currAlphabet && arr[chars[j] - 'a'] == 0){
                    currAlphabet = chars[j];
                    arr[currAlphabet - 'a'] = 1;
                } else if(chars[j] != currAlphabet && arr[chars[j] - 'a'] == 1){
                    currAlphabet = chars[j];
                    arr[currAlphabet - 'a'] = 2;
                } else {
                    currAlphabet = chars[j];
                }
            }

            List<Integer> arrList = Arrays.stream(arr)
                    .boxed()
                    .collect(Collectors.toList());
            HashSet <Integer> hashSet = new HashSet<>(arrList);

            if(!hashSet.contains(2)) result++;
        }
        bw.write(result+"");

        bw.flush();
        bw.close();
    }
}