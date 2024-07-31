import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int depth = Integer.parseInt(st.nextToken());

        dfs(depth, 1, new StringBuilder());

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();

    }

    static void dfs(int depth, int num, StringBuilder tmp) {

        for(int i = num; i <= n; i++) {
            if(depth > 1) dfs(depth-1, i, new StringBuilder().append(tmp).append(i).append(" "));
            if(1 == depth) {sb.append(tmp).append(i).append("\n");}
        }
    }



}