class Solution {
    public boolean solution(int x) {
		int sumXDigit = 0;
		int xClone = x;
		while(xClone !=0) {
			sumXDigit += xClone%10;
			xClone /= 10;
		}
        
        return x % sumXDigit == 0;
    }
}