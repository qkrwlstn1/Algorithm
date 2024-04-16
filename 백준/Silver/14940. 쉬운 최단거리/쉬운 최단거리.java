
import java.io.*;
import java.util.*;

import static java.lang.Integer.*;

public class Main {
        static  int[] dx = {1,-1,0,0};
        static  int[] dy = {0,0,1,-1};
        static long W=0;
        static long B=0;
        static boolean[][] visit;
        static int[][] graph;
        static int[][] answer;
        static int n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = parseInt(st.nextToken());//세로
        m = parseInt(st.nextToken());//가로
        visit = new boolean[n][m];
        answer = new int[n][m];
        int[] start = new int[2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int tmp = parseInt(st.nextToken());
                if(tmp == 1){
                    answer[i][j] = -1;
                }else if (tmp == 0){
                    answer[i][j]= 0;
                }else{
                    answer[i][j]= 0;
                    start[0] = i;
                    start[1] = j;
                }
            }
        }
        bfs(start);
        for (int[] i : answer) {
            for (int j : i) {
                bw.append(j + " ");
            }
            bw.append("\n");
        }
        
        bw.close();
        br.close();
    }
    static void bfs(int[] start){
        // 0 = y, 1 = x, 2 = 거리
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{start[0], start[1], 0});
        while(!q.isEmpty()){
            int[] tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int y = tmp[0] + dy[i];
                int x = tmp[1] + dx[i];
                if(check(y,x)){
                    answer[y][x] = tmp[2] + 1;
                    q.add(new int[]{y, x, tmp[2] + 1});
                }
            }
        }
    }

    static boolean check(int y, int x){
        return !(x >= m || y >= n || y < 0 || x < 0 || answer[y][x] != -1);
    }

}