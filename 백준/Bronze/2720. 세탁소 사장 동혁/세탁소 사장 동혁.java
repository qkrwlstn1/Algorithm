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

        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int c = Integer.parseInt(br.readLine());
            bw.append(c/25 + " ");
            c = c % 25;
            bw.append(c/10 + " ");
            c = c % 10;
            bw.append(c/5 + " ");
            c = c % 5;
            bw.append(c + "\n");
        }

        bw.flush();
        bw.close();
    }


}