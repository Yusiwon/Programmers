package Level1;

class 최대공약수와최소공배수 {
    public long[] solution(long n, long m) {
        long[] answer = new long[2];
        answer[0] = cdg(Math.max(n, m), Math.min(n, m));
        answer[1] = csg(n, m, answer[0]);
        return answer;
    }

    public long cdg(long n, long m) {
        while (m > 0) {
            long temp = n;
            n = m;
            m = temp % m;
        }
        return n;
    }

    public long csg(long n, long m, long cdg) {
        long result = (n * m) / cdg;
        return result;
    }
}