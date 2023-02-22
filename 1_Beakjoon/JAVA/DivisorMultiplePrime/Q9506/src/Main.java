import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N == -1) break;
            ArrayList<Integer> arrayList = new ArrayList<>();
            for(int i = 1; i < N; i++){
                if(N%i == 0){
                    arrayList.add(i);
                }
            }
            int sum = 0;
            boolean flag = true;
            for(int j = 0; j < arrayList.size(); j++){
                sum += arrayList.get(j);
            }
            if(sum != N){
                flag = false;
            }
            if(flag){
                bw.write(N+" = ");
                for(int k = 0; k < arrayList.size(); k++){
                    if(k != arrayList.size()-1){
                        bw.write(arrayList.get(k) + " + ");
                    } else {
                        bw.write(arrayList.get(k) + "\n");
                    }
                }
            } else {
                bw.write(N + " is NOT perfect.\n");
            }
        }

        bw.flush();
        bw.close();
    }
}