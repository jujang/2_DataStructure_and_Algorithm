import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'squares' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER a
     *  2. INTEGER b
     */

    public static int squares(int a, int b) {
        // Write your code here
//         int cnt = 0;
//         for(int i = a; i <= b; i++){
//             if(i == 1) {
//                 cnt++;
//                 continue;
//             }
//             for(int x = 0; x*x <= i; x++){
//                 if(x*x == i) {
//                     cnt++;
//                 }
//             }
//         }
//         return cnt; -> time out

        return (int)(Math.floor(Math.sqrt(b))) - (int)(Math.ceil(Math.sqrt(a))) + 1;

//        int count = 0;
//        for(int i = 1; i <= b; i++) {
//            int square = i * i;
//            if(square > b) break;
//            if(square >= a && square <= b) count++;
//        }
//        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int a = Integer.parseInt(firstMultipleInput[0]);

                int b = Integer.parseInt(firstMultipleInput[1]);

                int result = Result.squares(a, b);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
