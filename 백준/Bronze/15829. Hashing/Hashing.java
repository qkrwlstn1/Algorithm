import java.io.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        long answer = 0;
        long tmp =1;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put((char)('a' + i), i+1);
        }
        char[] arr = br.readLine().toCharArray();
        for (int i = 0; i < n; i++) {
            answer += tmp * map.get(arr[i]);
            answer %= 1234567891;
            tmp = tmp * 31 % 1234567891;
        }

        bw.append(answer+"");
        bw.flush();
        bw.close();
        br.close();
    }


}