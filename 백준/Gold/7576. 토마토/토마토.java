import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n,m;
    static boolean[][] visited;
    static int[][] tomato;
    static ArrayDeque<int[]> q = new ArrayDeque<>();
    static int day = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[m][n];
        tomato = new int[m][n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                tomato[i][j] = Integer.parseInt(st.nextToken());
                if (tomato[i][j] == 1){
                    visited[i][j] = true;
                    q.addFirst(new int[] {i, j, 0}); //y, x, day
                }
            }
        }

        while (!q.isEmpty()) {
            int[] tmp = q.removeFirst();
            int y = tmp[0]; int x = tmp[1];
            day = tmp[2];

            for (int i = 0; i < 4; i++) {
                if(check(y+dy[i], x+dx[i])){
                    q.addLast(new int[] {y+dy[i], x+dx[i], tmp[2] + 1});
                    visited[y+dy[i]][x+dx[i]] = true;
                }

            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && tomato[i][j] == 0) {day = -1;}
            }
        }
        sb.append(day);

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    static boolean check(int y, int x) {
        return y >=0 && x>=0 && y<m && x<n && !visited[y][x] && tomato[y][x] == 0;
    }




}