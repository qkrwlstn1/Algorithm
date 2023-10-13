import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        		Solution as = new Solution();
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0; i<b; i++) {
        	for(int j=0; j<a; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
    }
}