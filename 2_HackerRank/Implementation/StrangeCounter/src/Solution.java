import java.io.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'strangeCounter' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER t as parameter.
     */

    public static long strangeCounter(long t) {
        // Write your code here
        long value = 0;
        long cnt = 0;
        long prevVal = 0;

        while(value < t) {
            prevVal = value;
            cnt++;
            value += calA(cnt);
        }

        long setVal = (long)value - (long)prevVal;

        return setVal - (t - (prevVal + 1));
    }

    public static long calA(long n){
        return 3*(long)Math.pow(2, n-1);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long t = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.strangeCounter(t);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
