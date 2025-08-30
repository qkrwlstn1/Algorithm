import java.io.*;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static int n;
    static int[] arr, dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 최소 담아야 하는 물
        int k = Integer.parseInt(st.nextToken()); // 칸

        int tmp = 0;

        for(int i = 0; i<k; i++){
            n -= tmp;
            if(n == 0) break;
            tmp = 1;
            while (tmp<< 1 <= n){
                tmp = tmp << 1;
            }

        }
        int ans;
        if(n == 0 || n == tmp) ans = 0;
        else ans = tmp*2 - n;
        bw.append(ans + "");
        bw.flush();
        bw.close();
    }




}