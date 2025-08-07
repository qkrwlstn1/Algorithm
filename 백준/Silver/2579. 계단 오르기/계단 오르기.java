import java.io.*;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static int n;
    static int[] arr, dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        arr = new int[Math.max(n+1, 3)];
        dp = new int[Math.max(n+1, 3)];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            dp[i] = -1;
        }
        dp[1] = arr[1];
        dp[2] = arr[1] + arr[2];

        bw.append(dp(n) + "");
        bw.flush();
        bw.close();
    }

    static int dp(int num){
        if(dp[num] != -1) return dp[num];
        return dp[num] =  Math.max(dp(num-3) + arr[num-1], dp(num-2)) + arr[num];
    }


}