
import java.util.ArrayList;
class Solution {
    public int solution(int n) {
        if(n == 1) return 1;
        if(n == 2) return 1;
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        int temp = 0;
        for(int i=1;i<=n/2+1; i++) {
        	arr.add(i);
        	temp +=i;
        	if(temp >= n) {
        		while(temp > n) {
        			temp -= arr.get(0);
        			arr.remove(0);
        		}
        		if(temp == n) {
        			answer++;
        		}
        		
        	}
        }
        answer++;
        return answer;
    }
}