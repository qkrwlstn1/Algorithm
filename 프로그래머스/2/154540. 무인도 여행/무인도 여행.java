import java.util.ArrayList;
import java.util.List;

class Solution {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;

    static public int[] solution(String[] maps) {
        int[] answer = {};
        char[][] map = new char[maps.length][maps[0].length()];
        visited = new boolean[maps.length][maps[0].length()];
        //map, visited 초기화
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                map[i][j] = maps[i].charAt(j);
                if(map[i][j] != 'X') {
                    visited[i][j] = true;
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                if(map[i][j] != 'X' && visited[i][j]) {
                    list.add(dp(map, j, i, maps[i].charAt(j)-'0'));
                }
            }
        }
        if (list.isEmpty())  return new int[] {-1};

        return list.stream()
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();
    }

    public static int dp(char[][] map, int x, int y, int day) {
        visited[y][x] = false;
        for (int i = 0; i < 4; i++) {
            if (check(x+dx[i], y+dy[i])) {
                day = dp(map, x+dx[i], y+dy[i], day+(map[y+dy[i]][x+dx[i]] - '0'));
            }
        }
        return day;
    }

    public static boolean check(int x, int y) {
        return -1 < x && visited[0].length > x && -1 < y && visited.length > y && visited[y][x];
    }
}