package Level1;

class 가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";

        int mid = s.length() / 2;
        if (s.length() % 2 == 0) {  // 짝수일경우
            answer = s.substring(mid - 1, mid+1);
        } else {                    // 홀수일경우
            answer = s.substring(mid, mid + 1);
        }

        return answer;
    }
}
