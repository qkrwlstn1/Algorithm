class Solution {
    public boolean solution(String s) {
		boolean answer = true;
		if(s.length() !=4 && s.length() != 6) return false;
		for(char i : s.toCharArray()) {
			if(i>'9') return false;
		}
        return answer;
    }
}