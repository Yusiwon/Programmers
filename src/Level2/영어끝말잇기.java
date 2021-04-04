package Level2;

import java.util.ArrayList;
import java.util.List;

class 영어끝말잇기 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        List<String> list = new ArrayList<>();
        boolean flag = true;
        String pre = String.valueOf(words[0].charAt(0));

        for (int i = 0; i < words.length; i++) {
            if (list.contains(words[i]) ||
                    pre.charAt(pre.length() - 1) != words[i].charAt(0)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                flag = false;
                break;
            }

            list.add(words[i]);
            pre = words[i];
        }

        if (flag) {
            answer[0] = 0;
            answer[1] = 0;
        }
        return answer;
    }
}