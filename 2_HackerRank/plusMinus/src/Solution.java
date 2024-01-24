import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Float> plusMinus(List<Integer> arr) {
        // Write your code here
        float cntPlus = 0;
        float cntMinus = 0;
        float cntZero = 0;
        List<Float> list = new ArrayList<Float>();
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > 0) cntPlus+=1;
            else if(arr.get(i) < 0) cntMinus+=1;
            else cntZero+=1;
        }
        list.add(cntPlus/arr.size());
        list.add(cntMinus/arr.size());
        list.add(cntZero/arr.size());

        return list;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Float> result = Result.plusMinus(arr);

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
