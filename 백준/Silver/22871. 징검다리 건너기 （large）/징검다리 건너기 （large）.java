import java.io.*;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static int[] a;
    static long[] dp;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        dp = new long[n+1];
        a = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            dp[i] = -1L;
            a[i] = Integer.parseInt(st.nextToken());
        }
        dp[1] = 0L;
        bw.append(dp(n)+"");
        bw.flush();

    }

    static long dp(int n){
        if(dp[n] != -1 ) return dp[n];
        long min = 1000000000001L;
        for (int i = 1; i < n; i++) {
            min = Math.min(
                    Math.max(
                            dp(i), cal(i, n)
                    ) , min
            );
        }
        return dp[n] = min;

    }

    static long cal(int i, int j){
        return (long) (j - i) * (Math.abs(a[i] - a[j]) + 1);
    }




}