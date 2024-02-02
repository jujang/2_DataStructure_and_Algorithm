import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'workbook' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY arr
     */

    public static int workbook(int n, int k, List<Integer> arr) {
        // Write your code here
        int cnt = 0;
        int pageNum = 0;
        for(int i = 0; i < arr.size(); i++){
            int chapterProb = 0;
            while(arr.get(i)/k != 0 || arr.get(i)%k != 0){
                pageNum++;
                int startChapterProb = chapterProb + 1;
                if(arr.get(i)/k != 0) {
                    chapterProb += k;
                    arr.set(i, arr.get(i)-k);
                } else if(arr.get(i)%k != 0){
                    chapterProb += arr.get(i);
                    arr.set(i, 0);
                }
                if(pageNum >= startChapterProb && pageNum <= chapterProb) cnt++;
            }
        }
        return cnt;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.workbook(n, k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
