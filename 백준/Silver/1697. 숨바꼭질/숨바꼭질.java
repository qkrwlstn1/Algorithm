

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;


public class Main {
    static boolean[] graph = new boolean[100001];
    static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        bfs(n, m);
        sb.append(ans);
        bw.append(sb);
        br.close();
        bw.close();

    }

    static void bfs(int start, int target) {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{start, 0});

        while (!q.isEmpty()) {
            int[] tmp = q.removeFirst();
            int idx = tmp[0];
            int cnt = tmp[1];
            if (target == idx) {
                ans = Math.min(ans, cnt);
            } else if (start > target) {
                ans = Math.min(ans, (start - target) + cnt);
            } else if (cnt + 1 < ans) {
                cnt++;
                if (idx * 2 < 100001 && !graph[idx * 2]) {
                    graph[idx * 2] = true;
                    q.add(new int[]{idx * 2, cnt});
                }
                if (idx + 1 < 100001 && !graph[idx + 1]) {
                    graph[idx + 1] = true;
                    q.add(new int[]{idx + 1, cnt});
                }
                if (idx > 0 && !graph[idx - 1]) {
                    graph[idx - 1] = true;
                    q.add(new int[]{idx - 1, cnt});
                }
            }
        }

    }

}
