import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'happyLadybugs' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING b as parameter.
     */

    public static String happyLadybugs(String b) {
        // Write your code here

        boolean underScoreFlag = false;

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < b.length(); i++){
            if(b.charAt(i) == '_') underScoreFlag = true;
            else {
                if(hashMap.containsKey(b.charAt(i))) {
                    hashMap.replace(b.charAt(i), hashMap.get(b.charAt(i))+1);
                } else {
                    hashMap.put(b.charAt(i), 1);
                }
            }
        }

        if(underScoreFlag){
            if(hashMap.size() == 0) return "YES";
            else {
                if(hashMap.containsValue(1)) return "NO";
                return "YES";
            }
        } else {
            if(hashMap.containsValue(1)) return "NO";

            char prevChar = b.charAt(0);
            int cnt = 1;
            for(int j = 1; j < b.length(); j++){
                if(b.charAt(j) != prevChar) {
                    if(cnt == 1) return "NO";
                    else {
                        prevChar = b.charAt(j);
                        cnt = 1;
                    }
                } else {
                    cnt++;
                }
            }
            if(cnt == 1) return "NO";
            return "YES";
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, g).forEach(gItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                String b = bufferedReader.readLine();

                String result = Result.happyLadybugs(b);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
