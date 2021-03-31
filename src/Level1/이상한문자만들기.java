package Level1;

class 이상한문자만들기 {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split("");
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (str[i].equals(" ")) {
                count = 0;
            } else {
                if (count % 2 == 0) {
                    count++;
                    str[i] = str[i].toUpperCase();
                } else {
                    count++;
                    str[i] = str[i].toLowerCase();
                }
            }
            answer += str[i];
        }
        return answer;
    }
}