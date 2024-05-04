
import java.io.*;
import java.util.*;

import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int t = parseInt(br.readLine());
        int c;
        for (int i = 0; i < t; i++) {
            c= parseInt(br.readLine());
            bw.append(c / 25 + " ");
            c %= 25;
            bw.append(c/10+" ");
            c %= 10;
            bw.append(c/5 + " ");
            bw.append(c%5 + "\n");
        }

        bw.close();
        br.close();
    }

}