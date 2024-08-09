import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        arr = new int[n+1][n+1];
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = -1;
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                for (int k = 1; k < n+1; k++) {
                    if (arr[j][i] == 1 && arr[i][k] == 1) {
                        arr[j][k] = 1;
                        arr[k][j] = -1;
                    }
                    if (arr[j][i] == -1 && arr[i][k] == -1) {
                        arr[j][k] = -1;
                        arr[k][j] = 1;
                    }
                }
            }
        }

        for (int i = 1; i < n+1; i++) {
            int cnt = n-1;
            for (int j = 1; j < n+1; j++) {
                if (arr[i][j] != 0) cnt--;
            }
            sb.append(cnt).append("\n");
        }
        bw.append(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }


}