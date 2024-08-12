

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        ArrayDeque<Integer> startQ = new ArrayDeque<>();
        ArrayDeque<Integer> targetQ = new ArrayDeque<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            startQ.addLast(i);
            targetQ.addLast(Integer.parseInt(br.readLine()));
        }

        while(!startQ.isEmpty()){
            stack.addLast(startQ.removeFirst());
            sb.append("+\n");
            while(!stack.isEmpty() && stack.getLast().equals(targetQ.getFirst())){
                stack.removeLast();
                targetQ.removeFirst();
                sb.append("-\n");
            }
        }


        bw.append(stack.isEmpty() ? sb.toString() : "NO");
        bw.flush();
        bw.close();
        br.close();

    }

}
