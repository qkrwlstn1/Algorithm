import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		int answer = 0;
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int loop = sc.nextInt();
		int money;
		for(int i=0; i<loop; i++) {
			money = sc.nextInt();
			if(money == 0) stack.pop();
			else stack.add(money);
		}
		
		while(!stack.empty()) {
			answer += stack.pop();
		}
		System.out.println(answer);
		
	}
		
		
}
