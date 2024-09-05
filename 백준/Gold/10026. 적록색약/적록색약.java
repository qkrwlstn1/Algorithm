import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();


    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};
    static boolean[][] visited1;
    static boolean[][] visited2;
    static char[][] board;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        visited1 = new boolean[n][n];
        visited2 = new boolean[n][n];
        board = new char[n][n];

        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
        }
        int cnt1=0, cnt2=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited1[i][j]) {
                    cnt1++;
                    dfs1(i,j,board[i][j]);
                }
                if (!visited2[i][j]) {
                    cnt2++;
                    if(board[i][j] == 'B') dfs3(i,j,'B');
                    else dfs2(i,j);
                }
            }
        }

        sb.append(cnt1).append(" ").append(cnt2);

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    static void dfs1(int i, int j, char color) {
        for (int k = 0; k < 4; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];
            if(check(nx, ny, visited1) && color == board[nx][ny]){
                visited1[nx][ny] = true;
                dfs1(nx, ny, color);
            }
        }
    }


    static void dfs2(int i, int j) {
        for (int k = 0; k < 4; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];
            if(check(nx, ny, visited2) && ('G' == board[nx][ny] || 'R' ==board[nx][ny])){
                visited2[nx][ny] = true;
                dfs2(nx, ny);
            }
        }
    }

    static void dfs3(int i, int j, char color) {
        for (int k = 0; k < 4; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];
            if(check(nx, ny, visited2) && color == board[nx][ny]){
                visited2[nx][ny] = true;
                dfs3(nx, ny, color);
            }
        }
    }

    static boolean check(int i, int j, boolean[][] visited) {
        return i >= 0 && i < n && j >= 0 && j < n && !visited[i][j];
    }

}