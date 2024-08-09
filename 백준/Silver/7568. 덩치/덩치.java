import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[][] students = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            students[i][0] = Integer.parseInt(st.nextToken()); //몸무게
            students[i][1] = Integer.parseInt(st.nextToken()); //키
        }
        int[][] tmp = students.clone();

        for (int i = 0; i < students.length; i++) {
            int cnt = 1;
            for (int j = 0; j < students.length; j++) {
                if (students[i][0] < students[j][0] && students[i][1] < students[j][1]) {
                    cnt++;
                }
            }
            sb.append(cnt).append(" ");

        }
        bw.append(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }


}