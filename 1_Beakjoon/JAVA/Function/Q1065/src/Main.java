import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        if(N < 100) {
            bw.write(N + "");
        } else if(N == 1000) {
            bw.write(144 + "");
        } else {
            int cnt = 99;
            for(int i = 100; i <= N; i++){
                String str = String.valueOf(i);
                if((str.charAt(0) - str.charAt(1)) == (str.charAt(1) - str.charAt(2))){
                    cnt++;
                }
            }
            bw.write(cnt + "");
        }
        bw.flush();
        bw.close();
    }
}