import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n = Integer.parseInt(br.readLine());
		double[] arr = new double[n];
		double max = 0;
		double tmp = 0;
		for(int i=0; i<n; i++) {
			arr[i] = Double.parseDouble(br.readLine());
		}
		for(int i=0; i<n; i++) {
			tmp=arr[i];
			max = Math.max(max, tmp);
			for(int j=i+1; j<n; j++) {
				tmp *=arr[j];
				max = Math.max(max, tmp);
			}
		}
		System.out.printf("%.3f", max);
		//bw.append(Math.round(max*1000)/1000.000+"");
		bw.flush();
		bw.close();
		br.close();
	}
	
	
		
}