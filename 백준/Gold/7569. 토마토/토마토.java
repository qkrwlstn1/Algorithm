import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] floor = {0, 0, 0, 0, 1, -1};
    static int n, m, f;
    static boolean[][][] visited;
    static int[][][] tomato;
    static ArrayDeque<int[]> q = new ArrayDeque<>();
    static int day = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());
        visited = new boolean[f][m][n];
        tomato = new int[f][m][n];
        for (int k = 0; k <f; k++) {
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    tomato[k][i][j] = Integer.parseInt(st.nextToken());
                    if (tomato[k][i][j] == 1) {
                        visited[k][i][j] = true;
                        q.addFirst(new int[]{k, i, j, 0}); //f, y, x, day
                    }
                }
            }
        }
        while (!q.isEmpty()) {
            int[] tmp = q.removeFirst();
            int h = tmp[0];
            int y = tmp[1];
            int x = tmp[2];
            day = tmp[3];

            for (int i = 0; i < 6; i++) {
                if (check(h + floor[i],y + dy[i], x + dx[i])) {
                    q.addLast(new int[]{h + floor[i], y + dy[i], x + dx[i], tmp[3] + 1});
                    visited[h + floor[i]][y + dy[i]][x + dx[i]] = true;
                }

            }
        }
        for (int k = 0; k < f; k++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[k][i][j] && tomato[k][i][j] == 0) {
                        day = -1;
                    }
                }
            }
        }
        sb.append(day);

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    static boolean check(int h,int y, int x) {
        return h >=0 && h < f && y >= 0 && x >= 0 && y < m && x < n && !visited[h][y][x] && tomato[h][y][x] == 0;
    }


}