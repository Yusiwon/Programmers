package Level1;

import java.util.Locale;

class Solution {
    public String solution(String new_id) {
        String answer = new_id;

        // 1단계 : 모두 소문자로 치환
        answer = answer.toLowerCase();

        // 2단계 : 소문자, 숫자, -, _, .제외 모두 제거
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < answer.length(); i++) {
            char ch = answer.charAt(i);

            if (('a' <= ch && ch <= 'z') || ('0' <= ch && ch <= '9')
                    || ch == '-' || ch == '_' || ch == '.') {
                sb.append(ch);
            }
        }

        // 3단계 : ".." -(치환)-> "."
        answer = sb.toString();
        while (answer.contains("..")) {
            answer = answer.replace("..", ".");
        }

        // 4단계 : 처음과 끝의 "."제거
        if (answer.length() > 0) {
            if (answer.startsWith(".")) {
                answer = answer.substring(1);
            }
            if (answer.endsWith(".")) {
                answer = answer.substring(0, answer.length()-1);
            }
        }

        // 5단계 : 빈문자열이라면 "a"대입
        if (answer.length() == 0) {
            answer = "a";
        }

        // 6단계 : 길이가 16글자 이상이면 처음부터 15글자빼고 나머지 제거
        // 만약 제거 후 "."가 끝에 위치하면 "."제거
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);

            if (answer.endsWith(".")) {
                answer = answer.substring(0, answer.length() - 1);
            }
        }

        // 7단계 : 길이가 2이하라면 마지막 문자를 길이가 3이 될때까지 반복해서 이어붙인다.
        if (answer.length() < 3) {
            char last = answer.charAt(answer.length() - 1);

            if (answer.length() == 1) {
                answer = answer + last + last;
            } else if (answer.length() == 2) {
                answer = answer + last;
            }
        }
        return answer;
    }
}