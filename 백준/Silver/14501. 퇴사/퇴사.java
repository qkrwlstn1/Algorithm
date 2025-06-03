import java.io.*;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static int[] t;
    static int[] dp;
    static int[] p;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        dp = new int[n+2];
        t = new int[n+1];
        p = new int[n+1];

        for (int i = 1; i < n+1; i++) {
            st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());

        }

        for (int i = 1; i < n+1; i++) {
            int next = i + t[i];
            if(next > n+1) continue;
            if(dp[i] + p[i] > dp[next])  dp[next] = dp[i] + p[i];
            for (int j = next; j < n+2; j++) {
                if (dp[j] < dp[j-1]) dp[j] = dp[j-1];
            }
        }

        bw.append(dp[n+1]+"");
        bw.flush();

    }





}