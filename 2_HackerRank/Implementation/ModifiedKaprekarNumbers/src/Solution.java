import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'kaprekarNumbers' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER q
     */

    public static void kaprekarNumbers(int p, int q) {
        // Write your code here
        List<Long> list = new ArrayList<Long>();

        for(int j = p; j <= q; j++){
            if(prodNum(j) == j) list.add((long)j);
        }

        if(list.size() == 0) {
            System.out.print("INVALID RANGE");
        } else {
            for(int i = 0; i < list.size(); i++){
                System.out.print(list.get(i) + " ");
            }
        }
    }

    private static int prodNum(int n) {
        long squareNum = (long)n*n;
        int d = 0;
        while(n != 0){
            n = n / 10;
            d++;
        }

        int divider = 1;
        for(int i = 0; i < d; i++){
            divider *= 10;
        }

        int l = (int)(squareNum / divider);
        int r = (int)(squareNum % divider);

        return l + r;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        Result.kaprekarNumbers(p, q);

        bufferedReader.close();
    }
}
