class Solution {
    	public String solution(int[] numbers, String hand) {
        String answer = "";
        int lHand = 10, rHand =12,lMove = 0, rMove=0;
        boolean mainHand = hand.equals("left") ? true : false;
        for(int i=0; i<numbers.length; i++) {
        	if(numbers[i] == 0) numbers[i] =11;
        	
        	if(numbers[i] % 3 ==1) {
        		answer +="L";
        		lHand = numbers[i];
        	}else if(numbers[i] % 3 ==0) {
        		answer +="R";
        		rHand = numbers[i];
        	}else {
        		rMove =0;
        		lMove =0;
        		rMove = Math.abs(rHand- numbers[i])/3 + Math.abs(rHand-numbers[i])%3;
        		lMove = Math.abs(lHand- numbers[i])/3 + Math.abs(lHand-numbers[i])%3;
        		if(rMove == lMove) {
        			if(mainHand) {
        				lHand = numbers[i];
        				answer +="L";
        			}else {
        				rHand = numbers[i];
        				answer +="R";
        			}
        		}else if(rMove > lMove) {
        			lHand = numbers[i];
    				answer +="L";
        		}else {
        			rHand = numbers[i];
    				answer +="R";
        		}
        	}
        	System.out.println("r = "+rMove + " l = "+lMove);
        }
        return answer;
    }
}