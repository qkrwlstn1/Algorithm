import java.util.Stack;
class Solution{
   public int solution(String s){
		Stack<Character> a = new Stack<>();
		for(char tmp : s.toCharArray()) {
			if(!a.empty()) {
				if(a.peek() == tmp) {
					a.pop();
					continue;
				}
			}
			a.push(tmp);
		}
		return a.empty() ? 1 :0;
    }
}