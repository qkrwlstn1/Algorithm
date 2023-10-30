import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt(), n = sc.nextInt(), m =sc.nextInt();
		System.out.println( ((h-1)/(n+1) +1) * ((w-1)/(m+1) +1));		
	}
		
}
