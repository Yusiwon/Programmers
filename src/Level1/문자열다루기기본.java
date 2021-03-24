package Level1;

class 문자열다루기기본 {
    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() != 4 && s.length() != 6) {
            answer = false;
        }
        if (answer) {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch < '0' || '9' < ch) {
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }
}