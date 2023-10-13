import java.util.ArrayList;

class Solution {
    
	public int[] solution(int []arr) {
        
		int num=-1;
		ArrayList<Integer> arrList = new ArrayList<>();
		for(int i : arr) {
			if(num != i) {
				arrList.add(i);
				num =i;
			}
		}
        
       
        return arrList.stream().mapToInt(i -> i).toArray();
    }
}