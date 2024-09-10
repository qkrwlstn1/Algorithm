import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    static List<List<Integer>> graph;  // 인접 리스트로 변경
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        arr = new int[n + 1];
        Arrays.fill(arr, Integer.MAX_VALUE); // 초기화
        arr[x] = 0;

        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 입력 (인접 리스트에 저장)
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);  // 단방향으로 저장
        }

        // BFS 탐색
        ArrayDeque<Node> q = new ArrayDeque<>();
        q.offer(new Node(x, 0));

        while (!q.isEmpty()) {
            Node cur = q.poll();

            if (arr[cur.idx] < cur.cost) continue; // 이미 처리한 노드면 스킵

            for (int next : graph.get(cur.idx)) {
                if (arr[next] > cur.cost + 1) {
                    arr[next] = cur.cost + 1;
                    q.offer(new Node(next, arr[next]));
                }
            }
        }

        // 결과 출력
        for (int i = 1; i <= n; i++) {
            if (arr[i] == k) sb.append(i).append("\n");
        }

        if (sb.length() == 0) sb.append(-1); // 출력할 도시가 없으면 -1
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    static class Node {
        int idx;
        int cost;

        public Node(int idx, int cost) {
            this.idx = idx;
            this.cost = cost;
        }
    }
}