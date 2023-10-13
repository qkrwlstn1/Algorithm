
import java.util.ArrayList;
class Solution {
    public int solution(int[] nums) {
        ArrayList<Integer> kind = new ArrayList<>();
        boolean[] len = new boolean[200001];
        for(int i : nums) {
        	if(!len[i]) {
        		kind.add(i);
        		len[i] = true;
        	}
        }
        return nums.length/2 > kind.size() ? kind.size() : nums.length/2; 
    }
}