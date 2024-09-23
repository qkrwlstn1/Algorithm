import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int[] distance;
    static boolean[] visited;
    static List<List<Node>> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int INF = 10 * 20000 + 1;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(br.readLine());
        distance = new int[n+1];
        visited = new boolean[n+1];
        Arrays.fill(distance, INF);
        for (int i = 0; i < n+1; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            list.get(a).add(new Node(b,c));
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));
        distance[start] = 0;
        while (!pq.isEmpty()) {
            Node now = pq.poll();
            if (visited[now.idx]) continue;
            visited[now.idx] = true;
            for (Node next : list.get(now.idx)) {
                if (distance[next.idx] > now.cost + next.cost) {
                    distance[next.idx] = now.cost + next.cost;
                    pq.offer(new Node(next.idx, distance[next.idx]));
                }
            }
        }
        for (int i = 1; i < n+1; i++) {
            if(distance[i] == INF) sb.append("INF");
            else sb.append(distance[i]);
            sb.append("\n");
        }


        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }


    static class Node implements Comparable<Node> {
        int idx;
        int cost;
        Node(int idx, int cost){
            this.idx = idx;
            this.cost = cost;
        }


        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }



}