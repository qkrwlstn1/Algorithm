import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> score = new HashMap<>();
        for(int i=0; i<name.length; i++) {
        	
        	score.put(name[i], yearning[i]);
        }
        for(int i=0; i<photo.length; i++) {
        	for(int j=0 ;j<photo[i].length; j++) {
        		if(score.get(photo[i][j]) == null) continue;
        		answer[i] += score.get(photo[i][j]);
        	}
        }
        return answer;
    }
}