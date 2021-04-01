package Level1;

class 시저암호 {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                ch = (char)(ch + n);
                if (ch > 'Z') {
                    ch = (char)(ch - 26);
                }
            } else if ('a' <= ch && ch <= 'z') {
                ch = (char) (ch + n);
                if (ch > 'z') {
                    ch = (char) (ch - 26);
                }
            }
            answer += ch;
        }
        return answer;
    }
}