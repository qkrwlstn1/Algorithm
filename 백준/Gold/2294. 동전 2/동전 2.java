import java.io.*;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static int n, k, max;
    static int[] coin, dp;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        max = 10001;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); //동전 수
        k = Integer.parseInt(st.nextToken()); //목표
        coin = new int[n];
        dp = new int[k+1];
        visit = new boolean[k+1];
        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 1; i < k+1; i++) {
            dp[i] = max;
        }

        bw.append((dp(k) == max ? -1 : dp(k)) +"");

        bw.flush();
    }

    static int dp(int idx){
        if (visit[idx]) return dp[idx];
        visit[idx] = true;

        for (int i = 0; i < n; i++) {
            int nextIdx = idx - coin[i];
            if(nextIdx > -1){
                if(visit[nextIdx] && dp[nextIdx] == max) continue;
                dp[idx] = Math.min(dp[idx], dp(nextIdx) + 1);
            }
        }
        return dp[idx];
    }

}