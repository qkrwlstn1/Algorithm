class Solution {
    public int solution(String s) {
		switch (s.charAt(0)) {
		case '-':
			return Integer.parseInt(s.substring(1)) * -1;
		case '+':
			return Integer.parseInt(s.substring(1));
		default:
			return Integer.parseInt(s);
		}
		
    }
}