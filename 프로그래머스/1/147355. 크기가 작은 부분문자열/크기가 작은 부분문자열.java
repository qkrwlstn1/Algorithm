class Solution {
   public int solution(String t, String p) {
        
        long small = Long.parseLong(p);
        long limit = 1;
        int answer = 0;
        for(int i=0; i<p.length(); i++) {
        	limit *= 10;
        }
        for(int i=0; i<t.length()-p.length()+1; i++) {
        	long big = Long.parseLong(t.substring(i, i+p.length()));
        	if((big % limit) <= small ) answer++;
        	big /= 10;
        }
        
        return answer;
    }
}