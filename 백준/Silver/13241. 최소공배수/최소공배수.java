import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long left = sc.nextLong();
		long right = sc.nextLong();
		
		for(long i=1; i<=left; i++ ) {
			if((i*right) % left == 0) {
				System.out.println(i*right);
				return;
			}
		}
		sc.close();
		
	}
	
}