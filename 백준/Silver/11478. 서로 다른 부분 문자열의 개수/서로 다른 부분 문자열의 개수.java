import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static int[][] dp;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Set<String> set = new HashSet<>();
        char[] str = br.readLine().toCharArray();
        int len = 0;
        while (len != str.length){
            for (int i = 0; i < str.length - len; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(str[i]);
                for (int j = 1; j <= len; j++) {
                    sb.append(str[i+j]);
                }
                set.add(sb.toString());

            }
            len++;
        }


        bw.append(set.size()+"");
        bw.flush();


    }



}