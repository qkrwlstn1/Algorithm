import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            st = new StringTokenizer(br.readLine());

            int len = Integer.parseInt(st.nextToken());
            char[] arr = st.nextToken().toCharArray();

            for (int j = 0; j < len; j++) {
                if(arr[j] == '<'){
                    if(stack.isEmpty()) {
                        bw.append("illegal\n");
                        break;
                    }
                    stack.pop();
                }else stack.add('>');
                if(j == len-1){
                    if(stack.isEmpty()) bw.append("legal\n");
                    else bw.append("illegal\n");
                }
            }

        }





//        bw.append(""+answer);
        bw.flush();
        bw.close();
    }

}