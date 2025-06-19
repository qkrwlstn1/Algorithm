import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[] stick = new int[5];
//        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            stick[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(stick);
        int ans = 0;
        for (int i = 4; i>1; i--) {
            for (int j = i-1; j > 0; j--) {
                for (int k = j-1; k >=0 ; k--) {
                    if (stick[i] < stick[j]+stick[k]) ans++;
                }
            }
        }

        bw.append(ans+"");
        bw.flush();
        bw.close();

    }




}



