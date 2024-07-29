import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, String> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            String tmp = br.readLine();
            map.put(tmp, i+"");
            map.put(i+"", tmp);
        }

        for (int i = 0; i < m; i++) {
            bw.append(map.get(br.readLine())).append("\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}