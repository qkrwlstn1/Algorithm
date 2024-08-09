import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for(int i = 1; i <= n; i++) {
            deque.add(i);
        }
        sb.append("<");
        while(!deque.isEmpty()) {
            for(int i = 0 ; i < k-1 ; i++) {
                deque.addLast(deque.poll());
            }
            sb.append(deque.poll());
            if(!deque.isEmpty()) {sb.append(", ");}
        }
        sb.append(">");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }


}