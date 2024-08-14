import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited = new boolean[10001];
    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);


            dp(m, new StringBuilder());


        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static void dp(int depth, StringBuilder builder) {
        for (int i = 0; i < arr.length; i++) {
            if(!visited[arr[i]]) {
                visited[arr[i]] = true;
                if(depth == 1) {sb.append(builder).append(arr[i]).append("\n");}
                else dp(depth - 1, new StringBuilder(builder).append(arr[i]).append(" "));
                visited[arr[i]] = false;
            }

        }
    }


}