import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] factorial = new int[11];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        factorial[1] = 1;
        dp(10);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(m != 0 && n-m !=0)sb.append(factorial[n]/ (factorial[m] * factorial[n-m]));
        else sb.append(1);


        bw.append(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    static int dp(int n) {
        if(factorial[n] != 0) return factorial[n];
        return factorial[n] = n * dp(n-1);
    }

}