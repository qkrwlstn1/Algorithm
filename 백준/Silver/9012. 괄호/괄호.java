import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = Integer.parseInt(sc.nextLine());
		int cnt;
		loop : for(int i=0; i<loop; i++) {
			String vps = sc.nextLine();
			cnt=0;
			for(int j=0; j<vps.length(); j++) {
				if(vps.charAt(j) == '(') cnt++;
				else cnt--;
				if(cnt <0) {
					System.out.println("NO");
					continue loop;
				}
			}
			if(cnt !=0) System.out.println("NO");
			else System.out.println("YES");
		}
	}
}
