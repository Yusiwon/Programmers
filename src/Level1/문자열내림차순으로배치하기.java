package Level1;

import java.util.Arrays;
import java.util.Collections;

class 문자열내림차순으로배치하기 {
    public String solution(String s) {
        String answer = "";

        String str[] = s.split("");
        Arrays.sort(str);
        Collections.reverse(Arrays.asList(str));

        for (String string : str) {
            answer += string;
        }
        return answer;
    }
}
