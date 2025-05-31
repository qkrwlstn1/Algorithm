import java.io.*;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static int[] arr;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine());
        arr = new int[Math.max(3, n)];
        dp = new int[Math.max(3, n)];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            dp[i] = -1;
        }

        dp[0] = arr[0];
        dp[1] = dp[0] + arr[1];
        dp[2] = Math.max(Math.max(dp[0] + arr[2], arr[2] + arr[1]), dp[1]);

        bw.append(dp(n-1)+"");


        bw.flush();


    }


    public static int dp(int num){

        if(dp[num] != -1) return dp[num];
        if(num <3) return dp[num];
        return dp[num] = Math.max(Math.max(dp(num-1), dp(num-2)+arr[num]), dp(num-3) + arr[num] + arr[num-1]);
    }

}