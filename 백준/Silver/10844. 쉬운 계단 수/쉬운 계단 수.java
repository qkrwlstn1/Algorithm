import java.io.*;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static Long[][] arr = new Long[101][10];
    static int mod = 1000000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Long answer = 0L;
        int n = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < 10; i++) {
            arr[1][i] = 1L;
        }
        arr[1][0] = 0L;
        for (int i = 0; i < 10; i++) {
            answer = (answer + dp(i, n));
        }
        bw.append((answer% mod)+"");

        bw.flush();


    }


    public static long dp(int num, int depth){
        if(arr[depth][num] != null)return arr[depth][num];
        if(num == 0) return arr[depth][0] = dp(1, depth-1);
        else if (num == 9)return arr[depth][9] = dp(8, depth-1);
        else {
            return arr[depth][num] = (dp(num-1, depth-1) + dp(num+1, depth-1) % mod) ;

        }


    }

}