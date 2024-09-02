import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static StringBuilder sb;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);


        if(n == 1){
            System.out.print(arr[0]);
        }else {
            dp(new StringBuilder(), m, 0);
            System.out.print(sb);
        }

        br.close();
    }

    static void dp(StringBuilder dpSb, int depth,int num) {
        boolean[] visited = new boolean[10001];

        for (int i = num; i < n; i++) {
            if (!visited[arr[i]]) {
                visited[arr[i]] = true;
                StringBuilder tmp = new StringBuilder(dpSb).append(arr[i]);
                if (depth == 1) {
                    sb.append(tmp).append("\n");
                } else {
                    dp(new StringBuilder().append(tmp).append(" "), depth - 1, i);
                }
            }
        }
    }


}