import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();



    static boolean[] visited = new boolean[101];
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n+m; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        for (int i = 1; i < 101; i++) {
            if(!map.containsKey(i)) { map.put(i, i); }
        }

        sb.append(bfs());


        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    static int bfs(){
        int cnt=0;
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.addLast(new int[]{1,0});

        visited[1] = true;
        while (!q.isEmpty()){
            int[] cur = q.removeFirst();
            int num = map.get(cur[0]);
            if(num == 100) return cur[1];

            for (int i = 1; i < 7; i++) {
                if(num + i >100) continue;
                int now = map.get(num+i);

                if(now <= 100 && !visited[now]) {
                    q.addLast(new int[]{now, cur[1]+1});
                    visited[now] = true;
                }
            }

        }

        return cnt;

    }


}