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

        String[] arr = new String[5];

        int maxLength = 0;
        for(int i = 0; i < 5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = st.nextToken();
            if(arr[i].length() > maxLength) maxLength = arr[i].length();
        }

        String result = "";

        for(int index = 0; index < maxLength; index++){
            for(int y = 0; y < 5; y++){
                if(arr[y].length() > index){
                    result += arr[y].charAt(index);
                }
            }
        }

        bw.write(result);

        bw.flush();
        bw.close();
    }
}