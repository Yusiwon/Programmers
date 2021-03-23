package Level1;

import java.util.Stack;

class 크레인인형뽑기게임{
    public int solution(int[][] board, int[] moves) {

        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < moves.length; i++) {
            int line = moves[i]-1;
            int index = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[j][line] != 0) {
                    index = j;
                    break;
                }
            }
            if (board[index][line] == 0) {
                continue;
            }

            if (stack.isEmpty()) {
                stack.push(board[index][line]);
            } else {
                if (stack.peek() != board[index][line]) {
                    stack.push(board[index][line]);
                } else {
                    stack.pop();
                    count++;
                }
            }
            board[index][line] = 0;
        }
        return count*2;
    }
}
