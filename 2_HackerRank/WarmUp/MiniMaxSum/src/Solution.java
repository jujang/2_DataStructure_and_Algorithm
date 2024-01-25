import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Long> miniMaxSum(List<Integer> arr) {
        // Write your code here
        int minVal = arr.get(0);
        int maxVal = arr.get(0);
        long sum = 0L;
        for(int i = 0; i < arr.size(); i++){
            int value = arr.get(i);
            sum += value;
            if(minVal > value) minVal = value;
            if(maxVal < value) maxVal = value;
        }
        List<Long> list = new ArrayList<Long>();
        list.add(sum-maxVal);
        list.add(sum-minVal);
        return list;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Long> result = Result.miniMaxSum(arr);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
