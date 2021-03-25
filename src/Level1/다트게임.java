package Level1;

import java.util.ArrayList;

class 다트게임 {
    public int solution(String dartResult) {
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        int num = 0;
        char sdt = ' ';
        char starsharp = ' ';
        int result = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);
            char next = ' ';
            if (i + 1 < dartResult.length()) {
                next = dartResult.charAt(i + 1);
            }

            // 현재위치가 숫자일 경우
            if ('0' <= ch && ch <= '9') {
                if (ch == '1' && next == '0') {
                    num = 10;
                    i++;
                } else {
                    num = (ch - '0');
                }
            }
            // S, D, T일 경우
            else {
                if (ch == 'S') {
                    result = num;
                } else if (ch == 'D') {
                    result = num * num;
                } else if (ch == 'T') {
                    result = num * num * num;
                }

                // *, #d일 경우
                if(i < dartResult.length() && (next == '*' || next == '#')) {
                    if (next == '*') {
                        if (index > 0) {
                            list.set(index - 1, list.get(index-1) * 2);
                        }
                        result *= 2;
                    } else if (next == '#') {
                        result *= -1;
                    }
                    i++;
                }

                list.add(result);
                index++;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        return answer;
    }
}
