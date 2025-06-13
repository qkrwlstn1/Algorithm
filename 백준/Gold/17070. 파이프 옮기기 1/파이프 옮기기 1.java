import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static int[][][] dp; // Y X D
    static int[][] map;
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        dp = new int[n][n][3];
        map = new int[n][n];
        visit = new boolean[n][n];
        // 0 :→    1 : ↘   2 : ↓
        dp[0][1][0] = 1;
        dp[0][1][1] = 1;
        visit[0][1] = true;
        for (int i = 0; i < n; i++) {
            st =new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bw.append(dp(n-1,n-1, 1) + "");
        bw.flush();
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(dp[i][j][1] + " ");
//            }
//            System.out.println();
//        }
    }

    static int dp(int y, int x, int d){
        if(y < 0 || x < 0 || map[y][x] == 1) return 0;
        if(visit[y][x]) return dp[y][x][d];
        visit[y][x] = true;

        if(y-1 >= 0 && map[y-1][x] == 1){
            dp[y][x][0] =  dp(y, x-1, 0);
            dp[y][x][1] = dp(y, x-1, 0);
        }else if(x-1 >= 0 && map[y][x-1] == 1){
            dp[y][x][1] = dp(y-1, x, 2);
            dp[y][x][2] = dp(y-1, x, 2);
        }else{
            dp[y][x][0] = dp(y, x - 1, 0) + dp(y - 1, x - 1, 1);
            dp[y][x][1] = dp(y, x - 1, 0) + dp(y - 1, x - 1, 1) + dp(y - 1, x, 2);
            dp[y][x][2] = dp(y - 1, x - 1, 1) + dp(y - 1, x, 2);
        }


        return dp[y][x][d];

    }


}