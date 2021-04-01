package Level1;

class 콜라츠추측 {
    public int solution(long num) {
        int answer = 0;
        int count = 0;

        while (num > 1 && count < 500) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            count++;
        }

        if (count < 500) {
            answer = count;
        } else {
            answer = -1;
        }
        return answer;
    }
}