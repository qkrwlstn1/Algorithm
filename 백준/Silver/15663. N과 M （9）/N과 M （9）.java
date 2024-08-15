import java.io.*;
import java.util.*;

public class Main {
    static int[] arr;
    static int n, m;
    static Map<String, Boolean> map = new HashMap<>();
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        dp(m, new boolean[n], new StringBuilder());


        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }

    static void dp(int depth, boolean[] visited, StringBuilder str) {
        if (depth == 0) {
            sb.append(str).append('\n');
        }

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {
                boolean[] tmpBoolean = visited.clone();
                tmpBoolean[i] = true;
                StringBuilder tmpStr = new StringBuilder().append(str).append(arr[i]);
                if (map.containsKey(tmpStr.toString())) {
                    continue;
                } else map.put(tmpStr.toString(), true);


                dp(depth - 1, tmpBoolean, tmpStr.append(" "));


            }
        }
    }


}