import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static int[][] arr;
    static int N;
    static int minValue = 100*10*9*2;

    static boolean[] team1;
    static boolean[] team2;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        team1 = new boolean[N];

        arr = new int[N][N];
        for(int y = 0; y < N; y++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int x = 0; x < N; x++){
                arr[y][x] = Integer.parseInt(st.nextToken());
            }
        }

        grouping(0, 0);

        bw.write(minValue + "");

        bw.flush();
        bw.close();
    }

    public static void grouping(int memberCnt, int nextMember){

        if(memberCnt == N/2){
            team2 = new boolean[N];
            for(int i = 0; i < N; i++){
                if(team1[i] == false){
                    team2[i] = true;
                }
            }
            int teamValue1 = calculateTeamValue(team1);
            int teamValue2 = calculateTeamValue(team2);
            int valueDiff = Math.abs(teamValue1 - teamValue2);
            if(minValue > valueDiff){
                minValue = valueDiff;
            }
            return;
        }

        for(int i = nextMember; i < N; i++){
            team1[i] = true;
            grouping(memberCnt+1, i+1);
            team1[i] = false;
        }
    }

    public static int calculateTeamValue(boolean[] team){

        int sum = 0;
        int[] teamArr = new int[team.length/2];
        int cnt = 0;
        for(int i = 0; i < N; i++){
            if(team[i] == true) {
                teamArr[cnt++] = i;
            }
        }
        for(int a = 0; a < N/2; a++){
            for(int b = a+1; b < N/2; b++){
                sum += arr[teamArr[a]][teamArr[b]];
                sum += arr[teamArr[b]][teamArr[a]];
            }
        }

        return sum;
    }

}