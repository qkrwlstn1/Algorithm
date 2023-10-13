import java.util.HashMap;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int reportCnt=0;
        HashMap<String, Integer> idList = new HashMap<>();
        boolean theGameOfDeath[][] = new boolean[id_list.length][id_list.length];
        //theGameOfDeath[신고당한사람][신고한사람]
        for(int i=0; i<id_list.length; i++) {
        	idList.put(id_list[i], i);
        }//해쉬맵 초기화
        for(int i=0; i<report.length; i++) {
        	String temp[] = report[i].split(" ");
        	theGameOfDeath[idList.get(temp[1])][idList.get(temp[0])] = true;
        }//신고자 중복 제거
        for(int i=0; i<id_list.length; i++) {
        	reportCnt=0;
        	for(int j=0; j<id_list.length; j++) {
        		if(theGameOfDeath[i][j]) reportCnt++;
        	}
        	if(reportCnt >= k) {
        		for(int q=0; q<id_list.length; q++) {
            		if(theGameOfDeath[i][q]) answer[q]++;
            	}//end q
        	}// end j if
        	
        }// end i
        
        return answer;
    }
}