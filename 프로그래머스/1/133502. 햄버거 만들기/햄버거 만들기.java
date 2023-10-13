
import java.util.Stack;
class Solution {
    public int solution(int[] ingredient) {
		int answer = 0;
		Stack<Integer> burger = new Stack<>(); 
		for(int i : ingredient) {
			burger.push(i);
			if(burger.size()>3 && burger.get(burger.size()-1) == 1
					&&burger.get(burger.size()-2) == 3
					&&burger.get(burger.size()-3) == 2
					&&burger.get(burger.size()-4) == 1) {
				burger.pop();
				burger.pop();
				burger.pop();
				burger.pop();
				answer++;
				
			}
		}
		return answer;
	}

	
}