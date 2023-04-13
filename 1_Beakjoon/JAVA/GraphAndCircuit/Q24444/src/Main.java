import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static int R;
    static boolean[] visited;
    static int[] order;
    static ArrayList<Integer>[] arrayList;
    static int cnt = 1;

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        order = new int[N+1];
        arrayList = new ArrayList[N+1];
        for(int i = 0; i <= N; i++){
            arrayList[i] = new ArrayList<>();
        }

        for(int j = 0; j < M; j++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            arrayList[a].add(b);
            arrayList[b].add(a);
        }

        for(int k = 0; k < N; k++){
            Collections.sort(arrayList[k]);
        }
        // 정점번호 오름차순 방문할 것

        bfs(R);

        for(int x = 1; x <= N; x++){
            bw.write(order[x] + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static void bfs(int startPoint) throws IOException{
//        if(visited[startPoint] == true) return;
        visited[startPoint] = true;
        order[startPoint] = cnt++;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startPoint);
        while(!queue.isEmpty()){
            int point = queue.poll();
            for(int i = 0; i < arrayList[point].size(); i++){
                int temp = arrayList[point].get(i);
                if(visited[temp] == false) {
                    visited[temp] = true;
                    order[temp] = cnt++;
                    queue.add(temp);
                }
            }
        }
    }

}