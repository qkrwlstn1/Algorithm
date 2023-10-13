import java.util.HashMap;

class Solution {
    public int solution(String s) {
        String answer = "";
        HashMap<String, Integer> number = new HashMap<>(); 
        number.put("zero",0);
        number.put("one",1);
        number.put("two",2);
        number.put("three",3);
        number.put("four", 4);
        number.put("five",5);
        number.put("six",6);
        number.put("seven",7);
        number.put("eight",8);
        number.put("nine",9);
        String temp = "";
        for(char i : s.toCharArray()) {
        	
        	if(i <='9') answer += i;
        	else {
        		temp += i;
        		if(number.containsKey(temp)) {
        			answer += number.get(temp);
        			temp = "";
        		}
        	}
        }
        
        return Integer.parseInt(answer);
    }
}