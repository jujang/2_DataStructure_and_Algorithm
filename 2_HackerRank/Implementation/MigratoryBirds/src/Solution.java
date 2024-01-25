import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int maxFreq = 0;
        int maxVal = arr.get(0);

        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == 1) list.set(0, list.get(0)+1);
            else if(arr.get(i) == 2) list.set(1, list.get(1)+1);
            else if(arr.get(i) == 3) list.set(2, list.get(2)+1);
            else if(arr.get(i) == 4) list.set(3, list.get(3)+1);
            else if(arr.get(i) == 5) list.set(4, list.get(4)+1);
        }

        for(int j = 0; j < list.size(); j++){
            if(list.get(j) > maxVal) maxVal = list.get(j);
        }

        for(int k = 0; k < list.size(); k++){
            if(list.get(k) == maxVal) {
                maxFreq = k+1;
                break;
            }
        }

        return maxFreq;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
