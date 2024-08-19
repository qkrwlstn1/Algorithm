import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayDeque<Integer> deque;
        int t = Integer.parseInt(br.readLine());
        StringBuilder command;
        boolean isQ;

        Point : for (int i = 0; i < t; i++) {
            deque = new ArrayDeque<>();
            command = new StringBuilder();
            isQ = true;
            //----input start----------
            command.append(br.readLine());
            int num = Integer.parseInt(br.readLine());
            String str = br.readLine();
            StringTokenizer stk = new StringTokenizer(str.substring(1, str.length() - 1), ",[]");
            while (stk.hasMoreTokens()) {
                deque.add(Integer.parseInt(stk.nextToken()));
            }

            //----input end----------
            for (int j = 0; j < command.length(); j++) {
                switch (command.charAt(j)) {
                    case 'R':
                        isQ = !isQ;
                        break;
                    case 'D':
                        if (deque.isEmpty()) {
                            sb.append("error").append('\n');
                            continue Point;
                        }
                        if (isQ) deque.removeFirst();
                        else deque.removeLast();
                        break;
                }
            }

            if (deque.isEmpty()) sb.append("[]").append('\n');
            else {
                sb.append("[").append(isQ ? deque.removeFirst() : deque.removeLast());
                while (!deque.isEmpty()) {
                    sb.append(",").append(isQ ? deque.removeFirst() : deque.removeLast());
                }
                sb.append("]\n");
            }

        }


        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }


}