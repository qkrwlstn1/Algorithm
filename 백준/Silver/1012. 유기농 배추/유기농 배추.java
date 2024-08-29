

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;


public class Main {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    static boolean[][] arr;

    static int m,n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());

        for (int i = 0; i < t; i++) {
            int cnt = 0;
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            arr = new boolean[m][n];
            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                arr[a][b] = true;
            }
            for (int j = 0; j < m; j++) {
                for (int l = 0; l < n; l++) {
                    if(arr[j][l]){
                        cnt++;
                        bfs(j,l);
                    }
                }
            }
            sb.append(cnt).append("\n");

        }

        bw.append(sb);
        br.close();
        bw.close();

    }
    static void bfs(int startA, int startB){
        for (int i = 0; i < 4; i++) {
            int x = startA + dx[i];
            int y = startB + dy[i];
            if (check(x, y)) {
                arr[x][y] = false;
                bfs(x, y);
            }
        }
    }

    static boolean check(int x, int y){
        return x < m && y < n && x >= 0 && y >= 0 && arr[x][y];
    }

}
