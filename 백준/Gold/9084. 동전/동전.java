import java.io.*;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());//테스트 케이스
        int n, m;
        int[] coin;
        int[] dp;
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());//동전 가지 수
            st = new StringTokenizer(br.readLine());//동전 종류
            m = Integer.parseInt(br.readLine());//목표
            coin = new int[n];
            for (int j = 0; j < n; j++) {
                coin[j] = Integer.parseInt(st.nextToken());
            }
            dp = new int[m+1];
            dp[0] = 1;

            for (int j = 0; j < n; j++) {
                for (int k = 1; k < m+1; k++) {
                    if (0 <= k-coin[j]){
                        dp[k] = dp[k] + dp[k - coin[j]];
                    }
                }
            }
            bw.append(dp[m] +"\n");



        }


        bw.flush();
    }
}