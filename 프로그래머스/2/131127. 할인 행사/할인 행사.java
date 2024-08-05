import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        ArrayDeque<String> q = new ArrayDeque<>();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], 0);
        }

        for (int i = 0; i < 10; i++) {
            String s = discount[i];
            if (map.containsKey(s)) {map.put(s,map.get(s)+1);}
            q.addLast(s);
        }
        
        for (int i = 10; i < discount.length; i++) {
            String inFruit = discount[i];
            String outFruit = q.pop();
            if(check(want, map, number)) {
                answer++;
            }
            if(map.containsKey(inFruit)) {map.put(inFruit, map.get(inFruit)+1);}
            if(map.containsKey(outFruit)) {map.put(outFruit, map.get(outFruit)-1);}
            q.addLast(inFruit);
        }
        if(check(want, map, number)) {
            answer++;
        }

        return answer;
    }

    static boolean check(String[] want, Map<String, Integer> map, int[] number){
        for (int i = 0; i < want.length; i++) {
            if(map.get(want[i]) < number[i]){return false;}
        }
        return true;
    }

//    public static void main(String[] args) {
//        String[] want = {"banana", "apple", "rice", "pork", "pot"};
//        int[] number = {3,2,2,2,1};
//        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
//
//        System.out.println(solution(want, number, discount));
//
//    }

}
