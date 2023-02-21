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

        double sum = 0;
        double cnt = 0;
        for(int i = 0; i < 20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            String s = st.nextToken();
            double N = Double.parseDouble(s);
            double grade = 0;
            str = st.nextToken();
            if(str.equals("P")){
                continue;
            }
            switch (str){
                case "A+":
                    grade = 4.5;
                    break;
                case "A0":
                    grade = 4;
                    break;
                case "B+":
                    grade = 3.5;
                    break;
                case "B0":
                    grade = 3;
                    break;
                case "C+":
                    grade = 2.5;
                    break;
                case "C0":
                    grade = 2;
                    break;
                case "D+":
                    grade = 1.5;
                    break;
                case "D0":
                    grade = 1;
                    break;
                default :
                    grade = 0;
            }

            sum += (N*grade);
            cnt += N;
        }

        bw.write(String.format("%.6f", sum/cnt));

        bw.flush();
        bw.close();
    }
}