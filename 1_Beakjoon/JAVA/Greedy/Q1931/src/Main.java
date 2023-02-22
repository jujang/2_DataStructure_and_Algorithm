import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr;
    static boolean[] stand;
    static int N;
    static int cnt = 0;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        arr = new int[N][2];
        stand = new boolean[N];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (e1, e2) -> {
            if (e1[1] == e2[1]) {
                if(e1[0] > e2[0]) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (e1[1] > e2[1]) {
                return 1;
            } else {
                return -1;
            }
        });

        selectingClass(0);

//        for(int y = 0; y < N; y++){
//            bw.write(arr[y][0] + " " + arr[y][1] + "\n");
//        }
        bw.write(cnt+"");

        bw.flush();
        bw.close();
    }

    public static void selectingClass(int nextClass){

        int lastClass = nextClass;
        cnt++;
        for(int i = nextClass; i < N; i++){
            if(arr[i][0] >= arr[lastClass][1]){
                lastClass = i;
                cnt++;
            }
        }
    }

}