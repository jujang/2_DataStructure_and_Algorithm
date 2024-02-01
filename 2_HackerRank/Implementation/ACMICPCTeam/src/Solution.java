import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'acmTeam' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY topic as parameter.
     */

    public static List<Integer> acmTeam(List<String> topic) {
        // Write your code here
        int maxOneCnt = 0;
        int maxNum = 0;
        for(int i = 0; i < topic.size()-1; i++){
            for(int j = i+1; j < topic.size(); j++){
                int oneCnt = 0;
                for(int k = 0; k < topic.get(0).length(); k++){
                    if(topic.get(i).charAt(k) == '1' || topic.get(j).charAt(k) == '1') {
                        oneCnt++;
                        if(maxOneCnt < oneCnt) {
                            maxOneCnt = oneCnt;
                            maxNum = 0;
                        }
                    }
                }
                if(oneCnt == maxOneCnt) maxNum++;
            }
        }

        return List.of(maxOneCnt, maxNum);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<String> topic = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<Integer> result = Result.acmTeam(topic);

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
