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

        // 산술평균 구하기
        double avg = (double)sum/(double)N;
        int integerAvg = Integer.parseInt(String.format("%.0f", avg));

        // 중앙값 구하기
        Arrays.sort(arr);
        int middleValue = arr[N/2];

        // 최빈값 구하기
        int maxCnt = 0;
        int maxCntValue = 1;
        Iterator<Integer> keys = hashMap.keySet().iterator();
        while(keys.hasNext()){
            int key = keys.next();
            if(hashMap.get(key) > maxCnt){
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
            }
        }
        if(cnt >= 2){
            int[] cntArr = new int[cnt];
            Iterator<Integer> keys3 = hashMap.keySet().iterator();
            int counter = 0;
            while(keys3.hasNext()){
                int key = keys3.next();
                if(hashMap.get(key) == maxCnt){
                    cntArr[counter++] = key;
                }
            }
            Arrays.sort(cntArr);
            maxCntValue = cntArr[1];
        }

        // 범위 구하기
        int range = maxNum-minNum;

        bw.write(integerAvg+"\n");
        bw.write(middleValue+"\n");
        bw.write(maxCntValue+"\n");
        bw.write(range+"");

        bw.flush();
        bw.close();
    }
}