import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {

            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int answer = 0;
        for (int i = 0; i < 6; i++) {
            if (arr[i] == 0) {continue;}
            answer += (arr[i]-1)/t + 1;
        }
        sb.append(answer).append("\n");
        sb.append(n/p).append(" ").append(n%p);
        bw.append(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }


}