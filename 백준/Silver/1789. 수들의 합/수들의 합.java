import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Long n =Long.parseLong(br.readLine());
		int cnt =1;
		
		while(n>cnt) {
			n-=cnt;
			cnt++;
		}
		if(n != cnt) --cnt;
		bw.append(cnt+"");
		bw.close();
		br.close();
	}
	

}
