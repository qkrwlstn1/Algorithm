import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder str = new StringBuilder(br.readLine());
        str.insert(0, "+");
        int answer = 0;
        int tmp = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '-') {
                answer += Integer.parseInt(str.substring(i, str.length())) - tmp;
                tmp = 0;
                str = new StringBuilder(str.substring(0, i));
            } else if (str.charAt(i) == '+') {
                tmp += Integer.parseInt(str.substring(i, str.length()));
                str = new StringBuilder(str.substring(0, i));
            }
        }
        answer += tmp;

        System.out.println(answer);
        bw.flush();
        bw.close();
        br.close();

    }


}