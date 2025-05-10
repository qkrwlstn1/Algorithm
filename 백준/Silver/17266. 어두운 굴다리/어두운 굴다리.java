import java.io.*;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); // 굴다리 길이
        int m = Integer.parseInt(br.readLine()); // 가로등 수
        st = new StringTokenizer(br.readLine());
        int[] light = new int[m];
        for(int i=0; i<m; i++){
            light[i] = Integer.parseInt(st.nextToken());
        }
        int max = Math.max(light[0], n-light[m-1]);
        for(int i = m-1; i >0; i--){
            int num = light[i] - light[i-1];
            max = Math.max(max,  num/2 + num%2);
        }
        bw.append(max+"");
        bw.flush();
    }
}