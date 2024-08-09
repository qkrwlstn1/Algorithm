import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static int cnt =0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        if(n == 0) n =4;
        facto(n);
        sb.append(cnt);

        bw.append(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static int facto(int n) {

        if(n==1) return 1;

        int num = facto(n-1) * n;
        while(num % 10 ==0){
            cnt++;
            num /=10;
        }
        return num % 100000;
    }

}