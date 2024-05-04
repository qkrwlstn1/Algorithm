import java.io.*;
import java.util.*;

import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 2;
        int n = parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            answer =  answer * 2  - 1;;
        }
        bw.append(answer*answer + "");
        bw.close();
        br.close();
    }

}