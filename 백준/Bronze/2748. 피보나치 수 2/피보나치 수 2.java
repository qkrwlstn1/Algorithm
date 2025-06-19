import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static int n;
    static BigInteger[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        dp= new BigInteger[Math.max(2, n+1)];
        Arrays.fill(dp, BigInteger.valueOf(-1));
        dp[0] = BigInteger.valueOf(0);
        dp[1] = BigInteger.valueOf(1);
        bw.append(dp(n)+"");
        bw.flush();
        bw.close();

    }

    private static BigInteger dp(int n) {
        if (dp[n] != BigInteger.valueOf(-1)) return dp[n];
        return dp[n] = dp(n-1).add(dp(n-2));
    }


}



