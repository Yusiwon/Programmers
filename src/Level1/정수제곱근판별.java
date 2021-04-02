package Level1;

class 정수제곱근판별 {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);

        return sqrt==(int)sqrt?(long)(Math.pow(sqrt+1, 2)):-1;
    }
}