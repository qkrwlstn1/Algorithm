import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //유저의 수
        int m = Integer.parseInt(st.nextToken()); // 친구 관계의 수

        int minUser=0;
        int minCost = Integer.MAX_VALUE;

        graph = new boolean[n+1][n+1];
        boolean[] visited = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = true;
            graph[b][a] = true;
        }

        for (int i = 1; i < n+1; i++) {
            int num = bfs(i, new boolean[n+1]);
            if(num < minCost) {
                minUser = i;
                minCost = num;
            }
        }
        sb.append(minUser);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static int bfs(int n, boolean[] visited){
        ArrayDeque<int[]> q = new ArrayDeque<>();
        int cnt = 0;
        q.addLast(new int[]{n,0});
        visited[n] =true;
        while(!q.isEmpty()){
            int[] tmp = q.removeFirst();
            int user = tmp[0];
            int cost = tmp[1];

            cnt += cost;
            for (int i = 1; i < visited.length; i++) {
                if(!visited[i] && graph[user][i]){
                    visited[i] = true;
                    q.addLast(new int[]{i,cost+1});
                }
            }

        }
        return cnt;
    }


}