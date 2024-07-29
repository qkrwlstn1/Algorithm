import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        TreeSet<String> treeSet = new TreeSet<>();
        Set<String> set = new HashSet<>();
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            if(set.contains(input)){
                treeSet.add(input);
            }
        }
        bw.append(treeSet.size()+"\n");
        for (String s : treeSet) {
            bw.append(s).append("\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}