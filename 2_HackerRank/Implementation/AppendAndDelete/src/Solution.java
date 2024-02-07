import java.io.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        int lengthA = s.length();
        int lengthB = t.length();
        int shortLength = lengthA <= lengthB ? lengthA : lengthB;
        int longLength = lengthA <= lengthB ? lengthB : lengthA;

        int sameCnt = 0;
        for(int i = 0; i < shortLength; i++){
            if(s.charAt(i) == t.charAt(i)) sameCnt++;
            else break;
        }

        int value = lengthA - sameCnt + lengthB - sameCnt;

        if(lengthA + lengthB > k) {
            if(value == k) return "Yes";
            if(value < k && (k - (longLength - sameCnt))%2 == 0) return "Yes";
        } else {
            return "Yes";
        }

        return "No";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
