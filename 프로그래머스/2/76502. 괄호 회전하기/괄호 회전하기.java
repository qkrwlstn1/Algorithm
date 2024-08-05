

import java.util.ArrayDeque;

public class Solution {
    public static int solution(String s) {
        int answer = 0;
        int S = 1, M = 0, L = 0;
        ArrayDeque<Character> q = new ArrayDeque<>();
        int len = s.length();
        for (char c : s.toCharArray()) {
            q.addLast(c);
        }
        int cnt = 0;
        while (cnt < len) {
            cnt++;
            S = 0;
            M = 0;
            L = 0;
            ArrayDeque<Character> tmp = q.clone();
            ArrayDeque<Character> sequence = new ArrayDeque<>();
            point:for (int i = 0; i < len; i++) {
                char c;
                switch (tmp.pop()) {
                    case ')':
                        S--;
                        if(sequence.isEmpty() || sequence.pop() != 'S' || S < 0) {
                            S = 100;
                            break point;
                        }
                        break;
                    case '}':
                        M--;
                        if(sequence.isEmpty() || sequence.pop() != 'M' || M < 0) {
                            S = 100;
                            break point;
                        }
                        break;
                    case ']':
                        L--;
                        if(sequence.isEmpty() || sequence.pop() != 'L' || L < 0) {
                            S = 100;
                            break point;
                        }
                        break;
                    case '(':
                        sequence.addFirst('S');
                        S++;
                        break;
                    case '{':
                        sequence.addFirst('M');
                        M++;
                        break;
                    case '[':
                        sequence.addFirst('L');
                        L++;
                        break;
                } //switch end
            } // for i end

            if (S == 0 && M == 0 && L == 0) {

                answer++;
            }
            q.addLast(q.pop());
        }// while end

        return answer;
    }


}
