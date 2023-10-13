import java.util.HashMap;
import java.util.Vector;

class Solution {
	public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        HashMap<Character, Vector<String>> jungbok = new HashMap<>();
        
        for(int i=0; (i+'a') <='z'; i++) {
        	jungbok.put((char)('a'+i), new Vector<>());
        }
        
        jungbok.get(words[0].charAt(0)).add(words[0]);
        
        for(int i=1; i<words.length; i++) {
        	if(isJungbok(jungbok, words[i]) && words[i-1].charAt(words[i-1].length()-1) == words[i].charAt(0)) {
        		jungbok.get(words[i].charAt(0)).add(words[i]);
        	}else return new int[] {(i%n)+1,(i+1)%n == 0 ? (i+1)/n : (i+1)/n+1};
        }

        return answer;
    }
	
	boolean isJungbok(HashMap<Character, Vector<String>> map, String srt) {
		for(int i=0; map.get(srt.charAt(0)).size()>i; i++ ) {
			if(map.get(srt.charAt(0)).get(i).equals(srt)) {
				return false;
			}
		}
		
		return true;
	}
}