import java.io.*;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int[][] item = new int[n+1][2];
        int[][] dp = new int[k+1][n+1];
        for (int i = 1; i < n+1; i++) {
            st = new StringTokenizer(br.readLine());
            item[i][0] = Integer.parseInt(st.nextToken()); //무게
            item[i][1] = Integer.parseInt(st.nextToken()); //가치
        }

        for (int i = 1; i < n+1; i++) { //아이템
            for (int j = 1; j < k+1; j++) { //무게
                if (j >= item[i][0]) dp[j][i] = Math.max(dp[j][i-1], item[i][1] +dp[j-item[i][0]][i-1]);
                else dp[j][i] = dp[j][i-1];
            }
        }

//        for (int i = 0; i < k+1; i++) {
//            for (int j = 0; j < n+1; j++) {
//                System.out.printf("%d ",dp[i][j]);
//            }
//            System.out.println();
//        }
        
        bw.append(""+dp[k][n]);
        bw.flush();



    }
}
