package Level1;

import java.util.Arrays;
import java.util.Collections;

public class 문자열내림차순으로배치하기 {
}

class Solution {
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
