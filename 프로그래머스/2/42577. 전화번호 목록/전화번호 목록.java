import java.util.HashMap;
import java.util.Map;
class Solution {
    public boolean solution(String[] phone_book) {
        Map<String, Integer> search = new HashMap<>();
        for(String a : phone_book) {
        	search.put(a, null);
        }
        for(int i = 0; i<phone_book.length; i++) {
        	for(int j=0; j<phone_book[i].length(); j++) {
        		if(search.containsKey(phone_book[i].substring(0,j))) return false;
        	}
        }
        
        return true;
    }
}