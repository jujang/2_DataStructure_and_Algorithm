import java.io.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
        // Write your code here
        String str = "";
        String str1 = "12.09.";
        String str2 = "13.09.";
        String str3 = "26.09.";

        if(year >= 1700 && year <= 1918) {
            if(year == 1918) {
                str += str3;
            } else if(year%4 == 0) {
                str += str1;
            } else {
                str += str2;
            }
        } else if((year%400 == 0) || (year%4 == 0 && year%100 != 0)) {
            str += str1;
        } else {
            str += str2;
        }
        str += String.valueOf(year);

        return str;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
