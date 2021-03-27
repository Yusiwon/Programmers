package Level1;

import java.util.Arrays;

class 예산{
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        int result = 0;
        for (int i = 0; i < d.length; i++) {
            result += d[i];

            if (result > budget) {
                break;
            }
            answer++;
        }
        return answer;
    }
}