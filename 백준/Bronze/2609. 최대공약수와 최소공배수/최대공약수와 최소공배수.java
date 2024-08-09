import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int gcd = gcd(n,m);
        int ans = n;
        sb.append(gcd).append("\n");
        while(ans%n !=0 || ans%m !=0){
            ans +=gcd;
        }
        sb.append(ans);
        bw.append(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static int gcd(int n, int m) {
        if(m == 0) return n;
        return gcd(m, n % m);
    }
}