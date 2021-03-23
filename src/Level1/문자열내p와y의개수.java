package Level1;

import java.util.Locale;

class 문자열내p와y의개수 {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();

        int p = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'p') {
                p++;
            } else if (ch == 'y') {
                y++;
            }
        }

        if (p != y) {
            answer = false;
        }

        return answer;
    }
}
