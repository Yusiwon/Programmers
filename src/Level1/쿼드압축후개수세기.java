package Level1;

public class 쿼드압축후개수세기 {
}
class Solution {
    static int[][] board;
    static int zero = 0;
    static int one = 0;

    public int[] solution(int[][] arr) {
        int[] answer = new int[2];

        board = arr;
        dfs(board.length, 0, 0);

        answer[0] = zero;
        answer[1] = one;

        return answer;
    }

    public static void dfs(int size, int x, int y) {
        // 비교해야할 칸의 크기가 1일경우
        if (size == 1) {
            if (board[x][y] == 0) {
                zero++;
            } else {
                one++;
            }
            return;
        }

        // 같은값으로 압축여부 판단
        // 압축이 불가능할때만 구역을 나누어 판단
        if (!isPossible(size, x, y)) {
            dfs(size / 2, x, y);
            dfs(size / 2, x + (size / 2), y);
            dfs(size / 2, x, y + (size / 2));
            dfs(size / 2, x + (size / 2), y + (size / 2));
        }
    }

    public static boolean isPossible(int size, int x, int  y) {
        int number = board[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                // 구역의 첫번째칸값과 다를경우 -> 압축 불가능
                if (number != board[i][j]) {
                    return false;
                }
            }
        }

        // 압축이 가능한 경우
       if (number == 0) {
            zero++;
        } else {
            one++;
        }
        return true;
    }
}