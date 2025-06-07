import java.io.*;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 0 1 2  3  4  5
        // 1 5 10 20 50 100
//        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dollar = {1, 5, 10, 20, 50, 100};
        int solve = 0;
        int max = 0;
        for (int i = 0; i < 6; i++) {
            int tmp = dollar[i] * Integer.parseInt(st.nextToken());
            if(max <= tmp){
                max = tmp;
                solve = dollar[i];
            }
            

        }



        bw.write(solve + "");
        bw.flush();
        bw.close();
    }

}