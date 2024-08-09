import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);

        int[][] map = new int[n+1][n+1];
        int[][] path = new int[n+1][n+1];

        for (int i = 1; i < n+1; i++) {
            Arrays.fill(map[i], 1000*200);
            for (int j = 1; j < n+1; j++) {
                path[i][j] = j;
            }
        }
        for (int i = 0; i < m; i++) {
            input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);
            map[a][b] = c;
            map[b][a] = c;
        }

        for (int k = 1; k < n+1; k++) {
            for (int i = 1; i < n+1; i++) {
                for (int j = 1; j < n+1; j++) {
                    if(map[i][j] > map[i][k] + map[k][j]) {
                        map[i][j] = map[i][k] + map[k][j];
                        path[i][j] = path[i][k];
                    }
                }
            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if(i == j){
                    sb.append("- ");
                }
                else{sb.append(path[i][j]).append(" ");}

            }
            sb.append("\n");
        }
        bw.append(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }


}