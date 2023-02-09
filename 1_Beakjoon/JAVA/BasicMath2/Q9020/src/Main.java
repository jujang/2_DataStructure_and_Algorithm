import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int j = 0; j < N; j++){
            int x = Integer.parseInt(br.readLine());
            if(x == 4){
                bw.write(2 + " " + 2 + "\n");
            } else {
                for(int i = x/2; i > 0; i--){
                    if(i%2 == 0) continue;
                    int a = 3;
                    int plus = 1;
                    while(a <= Math.sqrt(i)){
                        if(i%a == 0) {
                            plus = 0;
                            break;
                        }
                        else{
                            a += 2;
                        }
                    }
                    if(plus == 1){
                        int b = 3;
                        int plus2 = 1;
                        while(b <= Math.sqrt(x-i)){
                            if((x-i)%b == 0) {
                                plus2 = 0;
                                break;
                            }
                            else{
                                b += 2;
                            }
                        }
                        if(plus2 == 1){
                            bw.write(i + " " + (x-i) + "\n");
                            break;
                        }
                    }
                }
            }
        }

        bw.flush();
        bw.close();
    }
}