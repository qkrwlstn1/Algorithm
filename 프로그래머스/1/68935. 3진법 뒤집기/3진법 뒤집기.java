class Solution {
   public int solution(int n) {
		
		String ternary = "";
		int answer =0;
		while(n > 0) {
			ternary += n % 3;
			n /= 3;
		}
		int digit = 1;
		for(int i =ternary.length()-1; i>=0; i--) {
			answer += digit*(ternary.charAt(i)-'0');
			
			digit *= 3;
		}
	
        return answer;
    }
}