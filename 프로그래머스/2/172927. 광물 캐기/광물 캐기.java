import java.util.HashMap;
import java.util.Map;

class Solution {


    static int fatigue = Integer.MAX_VALUE;
    static Map<String, Integer> map = new HashMap<>();
    public static int solution(int[] picks, String[] minerals) {
        int answer = 0;

        map.put("diamond",25);
        map.put("iron",5);
        map.put("stone",1);
        dfs(picks, minerals, 0, 0);
        answer = fatigue;
        return answer;
    }

    public static void dfs(int[] picks, String[] minerals, int sum, int index) {
        int tmpSum = 0;
        // 곡괭이 없을 때
        if(picks[0] == 0 && picks[1] == 0 && picks[2] == 0 ) {
            fatigue = Math.min(fatigue, sum);
            return;
        }
        // 이미 시도해 본 효율보다 나쁠 때
        if(sum >= fatigue) {
            return;
        }
        //미네랄이 없을 때
        if(index >= minerals.length){
            fatigue = Math.min(fatigue, sum);
            return;
        }
        // diamond
        if(picks[0] != 0){
            picks[0] -= 1;
            for(int j = index; j < Math.min(index+5, minerals.length); j++){
                tmpSum += 1;
            }
            dfs(picks, minerals, sum+tmpSum, index+5);
            picks[0] += 1;
        }
        // iron
        if(picks[1] != 0){
            tmpSum = 0;
            picks[1] -= 1;
            for(int j = index; j < Math.min(index+5, minerals.length); j++) {
                tmpSum += Math.max(map.get(minerals[j])/5, 1);
            }
            dfs(picks, minerals, sum+tmpSum, index+5);
            picks[1] += 1;
        }
        // stone
        if(picks[2] != 0){
            tmpSum = 0;
            picks[2] -= 1;
            for(int j = index; j < Math.min(index+5, minerals.length); j++) {
                tmpSum += map.get(minerals[j]);
            }
            dfs(picks, minerals, sum+tmpSum, index+5);
            picks[2] += 1;
        }



    }

}