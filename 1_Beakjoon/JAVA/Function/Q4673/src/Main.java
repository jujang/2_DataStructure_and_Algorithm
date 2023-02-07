import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i = 1; i <= 10000; i++){
            String str = String.valueOf(i);
            int numSum = Integer.parseInt(str);
            for(int j = 0; j < str.length(); j++){
               numSum += (str.charAt(j) - '0');
            }
            if(!hashSet.contains(numSum)) hashSet.add(numSum);
        } // 2, 4, 6, 8, 10, 11, 12, 14, 16, 18

        HashSet<Integer> hashSetAll = new HashSet<>();
        for(int i = 1; i <= 10000; i++){
            hashSetAll.add(i); // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        }
        hashSet.retainAll(hashSetAll); // 2, 4, 6, 8, 10
        hashSetAll.removeAll(hashSet); // 1, 3, 5, 7, 9
        ArrayList<Integer> arrayList = new ArrayList<>(hashSetAll);
        Collections.sort(arrayList);

        for(int i = 0; i < arrayList.size(); i++){
            bw.write(arrayList.get(i) + "\n");
        }

        bw.flush();
        bw.close();
    }
}