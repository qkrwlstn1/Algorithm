
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long lanCnt=0;
        int min = MAX_VALUE;
        Map<Integer,Integer> deck= new HashMap<>();
        int m = parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int card = parseInt(st.nextToken());
            deck.put(card, deck.getOrDefault(card, 0)+1);
        }
        m = parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int card = parseInt(st.nextToken());
            bw.append(deck.getOrDefault(card, 0) + " ");
        }

        bw.flush();
        bw.close();
        br.close();


    }


}
