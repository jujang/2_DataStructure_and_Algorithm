import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        int sum = 0;
        int maxNum = -4000;
        int minNum = 4000;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(br.readLine());
            sum += n;
            arr[i] = n;
            if(!hashMap.containsKey(n)){
                hashMap.put(n, 1);
            } else {
                hashMap.put(n, hashMap.get(n)+1);
            }
            if(n > maxNum) {
                maxNum = n;
            }
            if(n < minNum) {
                minNum = n;
            }
        }

        double avg = (double)sum/(double)N;
        int integerAvg = Integer.parseInt(String.format("%.0f", avg));
        Arrays.sort(arr);
        int middleValue = arr[N/2];
        int maxCnt = 0;
        int maxCntValue = 0;
        int secondmaxValue = 0;
        Iterator<Integer> keys = hashMap.keySet().iterator();
        while(keys.hasNext()){
            int key = keys.next();
            if(hashMap.get(key) > maxCnt){
                if(maxCntValue != 0){
                    secondmaxValue = maxCntValue;
                }
                maxCnt = hashMap.get(key);
                maxCntValue = key;
            }
        }
        Iterator<Integer> keys2 = hashMap.keySet().iterator();
        int cnt = 0;
        while(keys2.hasNext()){
            int key = keys2.next();
            if(hashMap.get(key) == maxCnt){
                cnt++;
                if(cnt >= 2){
                    maxCntValue = secondmaxValue;
                }
            }
        }

        int range = maxNum-minNum;

        bw.write(integerAvg+"\n");
        bw.write(middleValue+"\n");
        bw.write(maxCntValue+"\n");
        bw.write(range+"");

        bw.flush();
        bw.close();
    }
}