import java.io.*;
import java.util.*;

public class Main {
    static Long[] dp = new Long[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        dp[0] = 1L;
        dp[1] = 1L;
        dp[2] = 1L;
        dp[3] = 2L;
        dp[4] = 2L;

        for (int i = 0; i < n; i++) {
            sb.append(dp(Integer.parseInt(br.readLine())-1)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static Long dp(int n) {
        if(dp[n] != null) return dp[n];

        return dp[n] = dp(n-1) + dp(n-5);
    }


}