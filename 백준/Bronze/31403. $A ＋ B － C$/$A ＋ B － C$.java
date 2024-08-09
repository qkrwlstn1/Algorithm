import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        
        sb.append(Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c)).append("\n");
        sb.append(Integer.parseInt(a+b) - Integer.parseInt(c));
        bw.append(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }


}