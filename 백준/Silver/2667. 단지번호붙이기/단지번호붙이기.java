import java.io.*;
import java.util.*;

public class Main {
    static char[][] apart;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n, cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        n = Integer.parseInt(st.nextToken());
        apart = new char[n][n];
        for (int i = 0; i < n; i++) {
            apart[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (apart[i][j] == '1') {
                    cnt = 1;
                    apart[i][j] = '0';
                    bfs(i, j);
                    pq.add(cnt);
                }
            }
        }
        sb.append(pq.size()).append("\n");
        while (!pq.isEmpty()) {
            sb.append(pq.poll()).append("\n");
        }
        System.out.println(sb);
        br.close();
    }

    static void bfs(int x, int y) {

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (check(newX, newY)) {
                cnt++;
                apart[newX][newY] = '0';
                bfs(newX, newY);
            }
        }

    }

    static boolean check(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n && apart[x][y] == '1';
    }

}