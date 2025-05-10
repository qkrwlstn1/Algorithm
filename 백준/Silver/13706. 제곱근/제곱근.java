import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        BigInteger n = new BigInteger(br.readLine());
        BigInteger mid= new BigInteger("0");
        BigInteger left= new BigInteger("0");
        BigInteger right=n;
        while(!mid.multiply(mid).equals(n)){
            mid = left.add(right).divide(new BigInteger("2"));
            if(mid.multiply(mid).compareTo(n) > 0) right = mid;
            else left = mid;
        }

        bw.append(mid+"");
        bw.flush();
    }
}