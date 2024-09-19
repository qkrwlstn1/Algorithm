import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int[] distance;
    static List<List<Node>> graph = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        distance = new int[n+1];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        boolean[] visited = new boolean[n+1];
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());



        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            graph.get(Integer.parseInt(st.nextToken())).add(new Node(Integer.parseInt(st.nextToken()), 1));
        }
        Arrays.fill(distance, 300001);
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(x, 0));
        distance[x] =0;
        while (!pq.isEmpty()) {
            Node now = pq.poll();
            if (visited[now.idx])continue;
            visited[now.idx] = true;
            for (Node nextNode : graph.get(now.idx)) {
                if(distance[nextNode.idx] > distance[now.idx] + nextNode.distance){
                    distance[nextNode.idx] = distance[now.idx] + nextNode.distance;
                    pq.offer(new Node(nextNode.idx, distance[nextNode.idx]));
                }
            }

        }
        int ans=0;
        for (int i = 1; i <= n; i++) {
            if(distance[i] == k) sb.append(i).append("\n");
        }
        if(sb.length() == 0) sb.append(-1).append("\n");
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    static class Node implements Comparable<Node> {
        int idx;
        int distance;
        Node(int idx, int distance){
            this.idx = idx;
            this.distance = distance;
        }


        @Override
        public int compareTo(Node o) {
            return distance - o.distance;
        }
    }



}