import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        // 1. 기본 1차원 배열로 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 2. arr을 기반으로 set 생성
        List<Integer> arrList = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
        HashSet <Integer> hashSet = new HashSet<Integer>(arrList);

        // 3. set을 기반으로 newArr 생성
        int[] newArr = new int[hashSet.size()];
        Iterator<Integer> iterator = hashSet.iterator();
        int cnt = 0;
        while(iterator.hasNext()){
            newArr[cnt++] = iterator.next();
        }

        // 4. newArr 정렬할 것
        Arrays.sort(newArr);

        // 5. map 생성
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        // 6. newArr의 정렬순서를 map의 key별 value로 넣어줄 것
        for(int j = 0; j < newArr.length; j++){
            hashMap.put(newArr[j], j);
        }

        // 7. 다시 이 arr에 값과 같은 key를 찾아서 이 key가 가지고 있는 value를 arr원소들에 할당해 줄 것
        for(int k = 0; k < arr.length; k++){
            arr[k] = hashMap.get(arr[k]);
        }

        // 8. arr 순서대로 출력
        for(int x = 0; x < arr.length; x++){
            bw.write(arr[x] + " ");
        }

        bw.flush();
        bw.close();
    }
}