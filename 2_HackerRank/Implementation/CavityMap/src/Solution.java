import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'cavityMap' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static List<String> cavityMap(List<String> grid) {
        // Write your code here
        List<String> list = new ArrayList<String>();
        list.add(grid.get(0));

        for(int i = 1; i < grid.size()-1; i++){
            String str = Character.toString(grid.get(i).charAt(0));
            for(int j = 1; j < grid.get(0).length()-1; j++){
                if(grid.get(i).charAt(j-1) < grid.get(i).charAt(j) &&
                        grid.get(i).charAt(j+1) < grid.get(i).charAt(j) &&
                        grid.get(i-1).charAt(j) < grid.get(i).charAt(j) &&
                        grid.get(i+1).charAt(j) < grid.get(i).charAt(j)) {
                    str += "X";
                }
                else {
                    str += Character.toString(grid.get(i).charAt(j));
                }
            }
            str += Character.toString(grid.get(i).charAt(grid.get(0).length()-1));
            list.add(str);
        }
        if(grid.size() != 1) list.add(grid.get(grid.size()-1));
        return list;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> grid = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = Result.cavityMap(grid);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
