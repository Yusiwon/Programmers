package Level1;

class 삼진법뒤집기 {
    public int solution(int n) {
        int answer = 0;

        String reverse = "";
        while (n / 3 > 0) {
            reverse += n % 3;
            n /= 3;
        }
        reverse += n;


        for (int i = 0; i < reverse.length(); i++) {
            int num = reverse.charAt(i)-'0';
            answer += Math.pow(3, (reverse.length() - 1 - i))*num;
        }
        return answer;
    }
}