import java.io.*;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static int[][] dp;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;



        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();
        int aLen = a.length;
        int bLen = b.length;
        dp = new int[aLen+1][bLen+1];

        for (int i = 1; i < aLen+1; i++) {
            for (int j = 1; j < bLen+1; j++) {
                if (a[i - 1] == b[j - 1]) dp[i][j] = dp[i-1][j-1] + 1;
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        bw.append(dp[aLen][bLen]+"");
        bw.flush();


    }



}