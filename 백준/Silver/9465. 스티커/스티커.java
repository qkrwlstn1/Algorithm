import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static Integer[][] dp; ;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        for (int k = 0; k < t; k++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());

            dp = new Integer[Math.max(n, 2)][2];
            arr = new int[Math.max(n, 2)][2];

            for (int i = 0; i < 2; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[j][i] = Integer.parseInt(st.nextToken());
                }
            }
            dp[0][0] = arr[0][0];
            dp[0][1] = arr[0][1];
            dp[1][0] = arr[1][0] + arr[0][1];
            dp[1][1] = arr[1][1] + arr[0][0];

            sb.append(Math.max(dp(n - 1, 0), dp(n - 1, 1))).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    static int dp(int idx, int f){
        if(dp[idx][f] != null) return dp[idx][f];

        if(f == 1 ) return dp[idx][f] = Math.max(dp(idx-1,0), dp(idx-2,0)) + arr[idx][f];
        else return dp[idx][f] = Math.max(dp(idx-1,1), dp(idx-2,1)) + arr[idx][f];

    }


}