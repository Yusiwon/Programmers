package Level1;

class 평균구하기 {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        answer = (double) sum / (double) arr.length;
        return answer;
    }
}