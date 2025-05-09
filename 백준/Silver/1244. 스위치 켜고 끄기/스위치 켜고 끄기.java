import java.io.*;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int switchesSize = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(br.readLine());

        boolean[] switches = new boolean[switchesSize];
        for(int i =0; i<switchesSize; i++){
            if(st.nextToken().equals("1")) {
                switches[i] = true;
            }

        }

        for(int j=0; j<num; j++) {

            st = new StringTokenizer(br.readLine());
            if (st.nextToken().equals("1")) { //남자
                int manNum = Integer.parseInt(st.nextToken());
                int idx=manNum-1;
                while (idx < switchesSize){
                    switches[idx] = !switches[idx];
                    idx += manNum;
                }
            } else {//여자
                int woman = Integer.parseInt(st.nextToken()) - 1;
                switches[woman] = !switches[woman];
                int idx = 1;
                while (idx + woman < switchesSize && idx <= woman){
                    if(switches[idx + woman] != switches[woman - idx]) break;
                    switches[idx+woman] = !switches[idx+woman];
                    switches[woman - idx] = !switches[woman - idx];
                    idx++;
                }
            }
        }
        for(int i =0; i< switchesSize; i++){
            if(switches[i]) bw.append("1 ");
            else bw.append("0 ");
            if((i+1) % 20 == 0)bw.append("\n");
        }

        bw.flush();


    }
}