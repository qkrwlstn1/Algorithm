import java.io.*;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static int n, k;
    static int[] num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); //목표
        k = Integer.parseInt(st.nextToken()); //반복

        num = new int[n+1];
        num[0] = 1;

        for (int i = 0; i < k; i++) {
            for (int j = 1; j <= n; j++) {
                num[j] = (num[j] + num[j-1]) % 1000000000;
            }
        }

        bw.append(num[n]+"");

        bw.flush();
    }


}