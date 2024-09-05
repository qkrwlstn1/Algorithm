import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static boolean[] visited; ;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            visited = new boolean[10000];
            sb.append(bfs(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))).append("\n");
        }


        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    static StringBuilder bfs(int num, int target) {
        ArrayDeque<Integer> intQ = new ArrayDeque<>();
        ArrayDeque<StringBuilder> sbQ = new ArrayDeque<>();

        intQ.addLast(num);
        sbQ.addLast(new StringBuilder());

        while (!intQ.isEmpty()) {
            Integer number = intQ.removeFirst();
            StringBuilder stringBuilder = sbQ.removeFirst();
            if (number == target) return stringBuilder;
            if (visited[number]) {
                continue;
            }
            visited[number] = true;

            //D
            intQ.addLast((number * 2) % 10000);
            sbQ.addLast(new StringBuilder().append(stringBuilder).append("D"));

            //S
            if (number == 0) intQ.addLast(9999);
            else intQ.addLast(number - 1);

            sbQ.addLast(new StringBuilder().append(stringBuilder).append("S"));

            //L
            if (number > 999) {
                int tmp = number / 1000;
                intQ.addLast(((number % 1000) * 10) + tmp);
                sbQ.addLast(new StringBuilder().append(stringBuilder).append("L"));
            } else {
                intQ.addLast(number*10);
                sbQ.addLast(new StringBuilder().append(stringBuilder).append("L"));
            }

            //R
            int tmp = number % 10;
            intQ.addLast((number / 10) + (tmp * 1000));
            sbQ.addLast(new StringBuilder().append(stringBuilder).append("R"));


        }
        return null;
    }

}