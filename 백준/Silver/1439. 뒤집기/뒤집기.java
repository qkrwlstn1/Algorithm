import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static int n;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        char[] s = br.readLine().toCharArray();
        char tmp = '2';
        int one = 0;
        int zero = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i] == tmp) continue;

            if (s[i] == '0') {
                tmp = '0';
                zero++;
            }else {
                tmp = '1';
                one++;
            }
        }

        bw.append(Math.min(zero, one) + "");
        bw.flush();
        bw.close();
    }


}