import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        List<Integer> C = new ArrayList<>();


        int n = Integer.parseInt(br.readLine());
        ArrayDeque<int[]> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "1":
                    q.add(new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
                    break;
                case "2":
                    int[] food = q.removeFirst();
                    if (food[1] == Integer.parseInt(st.nextToken())) {
                        A.add((int) food[0]);
                    } else {
                        B.add((int) food[0]);
                    }
                    break;
            }
        }


        if (A.isEmpty()) {
            bw.append("None");
        } else {
            Collections.sort(A);
            for (Integer integer : A) {
                bw.append(integer + " ");
            }
        }
        bw.append("\n");
        if (B.isEmpty()) {
            bw.append("None");
        }else {
            Collections.sort(B);
            for (Integer integer : B) {
                bw.append(integer + " ");
            }
        }
        bw.append("\n");
        if (q.isEmpty()) {
            bw.append("None");
        } else {
            while (!q.isEmpty()) {
                C.add(q.removeFirst()[0]);
            }
            Collections.sort(C);
            for (Integer integer : C) {
                bw.append(integer + " ");
            }
        }


        bw.flush();
        bw.close();
        br.close();

    }


}