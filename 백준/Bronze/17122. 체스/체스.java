import java.io.*;
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
        boolean[] chess = new boolean[64];
        for (int i = 0; i < 8; i++) {
            if(i%2 == 0) chess[i] = true;
            if(i%2 != 0) chess[i+8] = true;
            if(i%2 == 0) chess[i+16] = true;
            if(i%2 != 0) chess[i+24] = true;
            if(i%2 == 0) chess[i+32] = true;
            if(i%2 != 0) chess[i+40] = true;
            if(i%2 == 0) chess[i+48] = true;
            if(i%2 != 0) chess[i+56] = true;
        }
//        for (int i = 0; i < 64; i++) {
//            if(i%8 == 0) bw.append("\n");
//            if (chess[i]) bw.append("1 ");
//            else  bw.append("0 ");
//
//        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            char[] tmp = st.nextToken().toCharArray();
            int a = (tmp[0] - 'A') + ((tmp[1] - '1') * 8);
            int b = Integer.parseInt(st.nextToken())-1;
            if (chess[a] == chess[b]) bw.append("YES\n");
            else bw.append("NO\n");
        }
        bw.flush();
        bw.close();

    }




}



