import java.io.*;
import java.util.*;

public class Main { // 마인크래프트
    static boolean[][] visit;
    static char[][] maze;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visit = new boolean[n][m];
        maze = new char[n][m];

        for (int i = 0; i < n; i++) {
            maze[i] = br.readLine().toCharArray();
        }
        System.out.println(bfs()+1);
       br.close();
    }

    static int bfs(){
        int result = Integer.MAX_VALUE;
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0,0,0}); // x, y, distance;
        visit[0][0] = true;
        while(!q.isEmpty()){
            int[] tmp = q.poll();
            int x = tmp[0];
            int y = tmp[1];
            int distance = tmp[2];
            if(distance >= result){continue;}
            if(x == n-1 && y == m-1){result = distance;break;}
            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                if(check(newX, newY)){
                    q.add(new int[]{newX, newY, distance+1});
                    visit[newX][newY] = true;
                }
            }

        }


        return result;
    }
    static boolean check(int x, int y){
        return x >= 0 && x < n && y >= 0 && y < m && !visit[x][y] && maze[x][y] == '1';
    }

}