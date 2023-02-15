import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

    static int cnt = 0;
    static int targetPoint;
    static int[] tmp = new int[500000];
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        mergeSort(arr, 0, arr.length-1, K);

        if(targetPoint == 0){
            bw.write(-1+"");
        } else {
            bw.write(targetPoint+"");
        }

        bw.flush();
        bw.close();
    }

    public static void mergeSort(int[] arr, int p, int r, int K){
        if(p < r){
            int q = (p+r)/2;
            mergeSort(arr, p, q, K);
            mergeSort(arr, q+1, r, K);
            merge(arr, p, q, r, K);
        }
    }

    public static void merge(int[] arr, int p, int q, int r, int K){

        int i = p;
        int j = q + 1;
        int t = 0;
        while(i <= q && j <= r){
            if(arr[i] <= arr[j]){
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }
        }
        while(i <= q){
            tmp[t++] = arr[i++];
        }
        while(j <= r){
            tmp[t++] = arr[j++];
        }
        i = p;
        t = 0;
        while(i <= r){
            arr[i++] = tmp[t++];
            if(++cnt == K){
                targetPoint = arr[i-1];
            }
        }
    }

}