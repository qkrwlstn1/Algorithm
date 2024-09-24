import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int maxL = Integer.parseInt(st.nextToken());
        int maxM = Integer.parseInt(st.nextToken());
        int maxR = Integer.parseInt(st.nextToken());
        int minL = maxL;
        int minM = maxM;
        int minR = maxR;
        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int tmpM = maxM;

            maxM = Math.max(maxL, Math.max(maxR, maxM)) + b;
            maxL = Math.max(tmpM,maxL) + a;
            maxR = Math.max(tmpM,maxR) + c;

            tmpM = minM;

            minM = Math.min(minM, Math.min(minL, minR)) + b;
            minL = Math.min(tmpM,minL) + a;
            minR = Math.min(tmpM,minR) + c;

        }

        sb.append(Math.max(maxL,Math.max(maxM,maxR))).append(" ").append(Math.min(minM, Math.min(minL, minR)));

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }






}