package Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];    // 정답을 담는 배열

        for (int i = 0; i < commands.length; i++) {
            int[] temp = new int[commands[i][1] - (commands[i][0] - 1)];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = array[commands[i][0] - 1 + j];
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }
        return answer;
    }
}
