import java.util.HashMap;

class Solution {
   public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> playerMapper = new HashMap<>();
        for(int i=0; i<players.length; i++) {
        	playerMapper.put(players[i], i);
        }
        String temp1;
        String temp2;
        for(int i=0; i<callings.length; i++) {
        	
        	temp1 = players[playerMapper.get(callings[i])];
        	temp2 = players[playerMapper.get(callings[i])-1];
        	//kai >> poe
        	players[playerMapper.get(callings[i])] = players[playerMapper.get(callings[i])-1];
        	//
        	players[playerMapper.get(callings[i])-1] = temp1;
        	playerMapper.put(temp1, playerMapper.get(callings[i])-1);
        	playerMapper.put(temp2, playerMapper.get(callings[i])+1);
        	
        	
        }
			
        return players;
    }
}