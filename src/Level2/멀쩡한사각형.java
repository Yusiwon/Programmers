package Level2;

class 멀쩡한사각형 {
    public long solution(long w, long h) {
        long answer = 1;

        long all = w * h;
        long cdg = cdg(w, h);
        long remove = (w / cdg + h / cdg - 1) * cdg;
        answer = all - remove;
        return answer;
    }

    public long cdg(long a, long b) {
        while (b > 0) {
            long temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}
