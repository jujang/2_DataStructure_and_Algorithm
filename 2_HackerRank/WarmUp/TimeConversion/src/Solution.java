import java.io.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here

        String newStr = null;
        String newStr2[] = null;
        int hh = 0;
        if(s.substring(s.length()-2).equals("PM")) {
            newStr = s.replace("PM", "");
            newStr2 = newStr.split(":");
            hh = Integer.parseInt(newStr2[0])+12;
            if(hh >= 24) hh = 12;
        } else {
            newStr = s.replace("AM", "");
            newStr2 = newStr.split(":");
            hh = Integer.parseInt(newStr2[0]);
            if(hh == 12 || hh == 24) hh = 0;
        }

        if(hh < 10) {
            return newStr.replace(newStr2[0], "0" + String.valueOf(hh));
        }
        return newStr.replace(newStr2[0], String.valueOf(hh));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
