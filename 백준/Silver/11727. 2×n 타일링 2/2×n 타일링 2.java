
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static int cnt = -1;
	static int height = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		if(n == 1) {
			System.out.println(1);
			return;
		}else if(n == 2) {
			System.out.println(3);
			return;
		}
		arr = new int[n+1];
		arr[1] = 1;
		arr[2] = 3;
		dp(n);
		bw.append(arr[n] + "");
		bw.flush();
		bw.close();
		br.close();
		
				

	}
	static int dp(int n) {
		if(arr[n] == 0 && n>2) {
			arr[n] = (dp(n-1) + (2*dp(n-2)))%10007;
			return arr[n];
		}else {
			
			return arr[n];	
		}
	}
}