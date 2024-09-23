import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int[] distance;
    static List<List<Node>> graph = new ArrayList<>();
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        distance = new int[n+1];
        Arrays.fill(distance, 1000000000);
        visited = new boolean[n+1];
        for (int i = 0; i < n+1; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph.get(a).add(new Node(b,c));
        }
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        PriorityQueue<Node> pq = new PriorityQueue<>();

        pq.offer(new Node(start,0));
        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            if (visited[cur.idx]) continue;
            visited[cur.idx] = true;
            for (Node next : graph.get(cur.idx)) {
                if(distance[next.idx] > cur.distance + next.distance) {
                    distance[next.idx] = cur.distance + next.distance;
                    pq.offer(new Node(next.idx,distance[next.idx]));
                }
            }
        }
        if(start == target)sb.append(0);
        else sb.append(distance[target]);
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