import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int child1 = sc.nextInt();
		int mom = sc.nextInt();
		int child2 = sc.nextInt();
		int dad = sc.nextInt();
		int parents = mom* dad / gcd(mom, dad);
		child1 = child1 * (parents / mom);
		child2 = child2 * (parents / dad);
		int children = child1 + child2;
		int gcd = gcd(children, parents);
		
		System.out.println((children / gcd) + " " + (parents / gcd));
		sc.close();
	}
	static int gcd(int a, int b) {
		if(a % b == 0) return b;
		else return gcd(b, a%b);
	}
	
}