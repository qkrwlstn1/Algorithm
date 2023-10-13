class Solution {
    public int[] solution(long n) {
        if(n == 0) return new int[] {0};
        String a = String.valueOf(n);
        int idxNum = 0;
		int[] answer = new int[a.length()];
		while(n != 0) {
			answer[idxNum] = (int) (n % 10);
			n /= 10;
			idxNum++;
		}
        return answer;
    }
}