import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static boolean[][] star;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        star = new boolean[n][n*2-1];
        star[0][n-1] = true;
        star[1][n-2] = star[1][n] = true;
        for (int i = 0; i < 5; i++) {
            star[2][n - 3 + i] = true;
        }
        int cnt = 1;
        for (int i = n/3; i > 1; i = i/2) {
            star(cnt++);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < star[0].length; j++) {
                if(star[i][j]) bw.append("*");
                else bw.append(" ");
            }
            bw.append("\n");
        }
        bw.flush();
        bw.close();

    }

    static void star(int num){
        int startA = 3 * (int)Math.pow(2,num-1);
        int depth = 3 * (int)Math.pow(2,num-1);
        for (int i = 0; i < depth; i++) {
            for (int j = 0; j < n*2-1; j++) {
                if(star[i][j]){
                    star[depth+i][j-startA] = true;
                    star[depth+i][j+startA] = true;
                }
            }

        }
    }


}



