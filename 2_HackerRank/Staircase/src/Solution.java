import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static List<String> staircase(int n) {
        // Write your code here

        List<String> list = new ArrayList<String>();
        for(int i = 1; i <= n; i++){
            String defaultStr = "";
            int j = 1;
            for(; j<=n-i; j++) {
                defaultStr += " ";
            }
            for(int k = j; k<=n; k++){
                defaultStr += "#";
            }
            list.add(defaultStr);
        }
        return list;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> result = Result.staircase(n);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
