import java.io.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String num = br.readLine();
        boolean palindrome = true;
        while (!num.equals("0")) {
            palindrome = true;
            char[] arr = num.toCharArray();
            int arrLen = arr.length;
            int loop = arrLen/2;

            for (int i = 0; i < loop; i++) {
                if (arr[i] != arr[arrLen-i-1]) {
                    palindrome = false;
                    break;
                }
            }
            sb.append(palindrome ? "yes\n" : "no\n");

            num = br.readLine();
        }


        bw.append(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }


}