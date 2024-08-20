import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0, end = 0, total = 0, ans = Integer.MAX_VALUE;

        while (end <= n && start <= n) {
            if (total >= m) {ans = Math.min(ans, end - start);}

            if(total < m){
                if(end == n) break;
                total += arr[end++];
            }
            else {
                if(start == n) break;
                total -= arr[start++];
            }
        }
//        if(n == 1 && m <= arr[0]) ans = 1;
        if(ans == Integer.MAX_VALUE) ans=0;
        sb.append(ans);


        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }



}