class Solution {
    public int solution(int a, int b, int n) {
		int answer = 0;
		int recycle =0;
		while(n / a != 0) {
			System.out.println(n);
			recycle = n%a;
			answer += (n/a)*b; 
			n = (n/a)*b+recycle;
		}
			
		
        return answer;
    }
}