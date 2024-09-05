import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int[][] dp; ;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        dp = new int[n][n];
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            dp[n-1][i] = arr[n-1][i];
        }

        sb.append(dp(0,0));
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    static int dp(int depth, int n){
        if(depth == dp.length-1 || dp[depth][n] != 0) return dp[depth][n];

        return dp[depth][n] = Math.max(dp(depth+1, n), dp(depth+1, n+1)) + arr[depth][n];
    }


}