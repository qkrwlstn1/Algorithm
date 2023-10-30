import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		int answer = 0;
		Scanner sc = new Scanner(System.in);
		int len[];
		do {
			len = new int[] {sc.nextInt(), sc.nextInt(), sc.nextInt()};
			if(len[0] == 0) return;
			if(len[0] < len[1]) {
				int tmp;
				tmp = len[0];
				len[0] = len[1];
				len[1] = tmp;
			}
			if(len[0] < len[2]) {
				int tmp;
				tmp = len[0];
				len[0] = len[2];
				len[2] = tmp;
			}
			if(len[0] >= len[1] + len[2]) System.out.println("Invalid");
			else if(len[0] == len[1] && len[1] == len[2]) System.out.println("Equilateral");
			else if(len[0] == len[1] || len[0] == len[2] || len[1] == len[2]) System.out.println("Isosceles");
			else System.out.println("Scalene");
			
		} while (true);
		
	}
		
	
	
		
}