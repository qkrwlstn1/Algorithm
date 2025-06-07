import java.io.*;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 동전수
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] dpLeft = new int[n];
        int[] dpRight = new int[n];
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            dpRight[i] = 1;
            for (int j = 0; j < i; j++) {
                if(dpRight[j] >= dpRight[i] && arr[i] > arr[j]) dpRight[i] = dpRight[j]+1;
            }

        }
        for (int i = n-1; i >= 0; i--) {
            dpLeft[i] = 1;
            for (int j = i; j < n; j++) {
                if(dpLeft[j] >= dpLeft[i] && arr[i] > arr[j]) dpLeft[i] = dpLeft[j]+1;
            }
            max = Math.max(max, dpRight[i] + dpLeft[i]);
        }







        bw.write((max - 1) + "");
        bw.flush();
        bw.close();
    }

}