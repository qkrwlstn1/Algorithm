
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		int idx = sc.nextInt();
		int[][] loopArr = new int[loop][idx];
		
		for(int i=0; i<loop; i++) {
			for(int j=0; j<idx; j++) {
				loopArr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<loop; i++) {
			for(int j=0; j<idx; j++) {
				loopArr[i][j] += sc.nextInt();
			}
		}
		
		for(int[] tmpArr : loopArr) {
			for(int tmp : tmpArr) {
				System.out.print(tmp + " ");
			}
			System.out.println();
		}
		
		
	}
	
}
