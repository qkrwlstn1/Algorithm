class Solution {
    public int solution(int num) {
        
        int limit =0;
        if(num == 1) return 0;
        while(limit != 500) {
        	if(num == 1) return limit;
        	if(num % 2 ==1) num = num*3+1;
        	else num /= 2;
        	limit++;
        }
        
        return -1;
    }
}