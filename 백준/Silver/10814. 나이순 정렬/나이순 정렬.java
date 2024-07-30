import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[][] user = new String[n][2];

        for (int i = 0; i < n; i++) {
            user[i] = br.readLine().split(" ");
        }

        Arrays.sort(user, new Comparator<String[]>() {

            @Override
            public int compare(String[] o1, String[] o2) {

                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (String[] strings : user) {
            sb.append(strings[0]).append(" ").append(strings[1]).append("\n");
        }
        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();

    }
}