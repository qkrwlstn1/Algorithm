import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static StringBuilder sb;
    static int[] arr;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer,Integer> map = new HashMap<>();
        n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        arr = new int[1001];
        dp = new int[1001];
        dp[1] = 1;
        if(arr[1] < arr[2]){
            dp[2] = 2;
        }

        for (int i = 1; i < n+1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp(n);
        int answer = 0;

        for (int i : dp) {
            answer = Math.max(answer, i);
        }

        bw.append(answer+"");
        bw.flush();
        br.close();
        bw.close();
    }

    static int dp(int target){
        int max = 0;
        for (int i = 1; i < target; i++) {
            if(dp[i] == 0){
                dp(i);
            }
            if(arr[target] > arr[i]) max = Math.max(max,dp[i]);
        }
        return dp[target] = max+1;
    }




}