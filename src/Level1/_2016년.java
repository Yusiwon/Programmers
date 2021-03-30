package Level1;

class _2016년{
    public String solution(int a, int b) {
        String answer = "";

        int[] year = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int date = 2;
        for (int i = 1; i < a; i++) {
            date += year[i];
        }
        date += b;
        date %= 7;

        answer = day[date];
        return answer;
    }
}
