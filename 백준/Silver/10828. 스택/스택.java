import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Vector<Integer> stack = new Vector<Integer>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "push":
                    stack.add(Integer.parseInt(command[1]));
                    break;
                case "pop":
                    if (stack.size() == 0) bw.append("-1\n");
                    else {
                        bw.append(stack.get(stack.size() - 1) + "\n");
                        stack.remove(stack.size() - 1);
                    }
                    break;
                case "size":
                    bw.append(stack.size() + "\n");
                    break;
                case "empty":
                    if(stack.size() == 0) bw.append("1\n");
                    else bw.append("0\n");
                    break;
                case "top":
                    if (stack.size() == 0) bw.append("-1\n");
                    else {
                        bw.append(stack.get(stack.size() - 1) + "\n");
                    }
            }

        }

        bw.flush();
        bw.close();
        br.close();

    }
}