class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
		int cards1cnt = 0, cards2cnt = 0;
		for(String s : goal) {
			if(cards1.length > cards1cnt && s.equals(cards1[cards1cnt])) cards1cnt++;
			else if(cards2.length > cards2cnt &&s.equals(cards2[cards2cnt])) cards2cnt++;
			else return "No";
		}
		
		
        return "Yes";
    }
}