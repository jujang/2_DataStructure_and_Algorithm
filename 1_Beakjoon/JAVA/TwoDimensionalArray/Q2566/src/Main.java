import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int maxValue = 0;
        int maxX = 0;
        int maxY = 0;

        for(int i = 0; i < 9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++){
                int thisValue = Integer.parseInt(st.nextToken());
                if(thisValue > maxValue){
                    maxValue = thisValue;
                    maxX = i;
                    maxY = j;
                }
            }
        }

        bw.write(maxValue+"\n");
        bw.write((maxX+1)+" "+(maxY+1));

        bw.flush();
        bw.close();
    }
}