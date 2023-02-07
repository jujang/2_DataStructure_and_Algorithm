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

        boolean[] arr = new boolean[30];
        int stu1 = 0;
        int stu2 = 0;
        for(int i = 0; i < arr.length-2; i++){
            arr[Integer.parseInt(br.readLine())-1] = true;
        }
        for(int j = 0; j < arr.length; j++){
            if(stu1 == 0 && arr[j] == false) stu1 = j + 1;
            else if(stu2 == 0 && arr[j] == false) stu2 = j + 1;
        }

        bw.write(stu1 + "\n" + stu2);
        bw.flush();
        bw.close();
    }
}