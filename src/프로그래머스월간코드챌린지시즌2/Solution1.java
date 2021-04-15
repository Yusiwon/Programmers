package 프로그래머스월간코드챌린지시즌2;

class Solution1 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] arr = new int[absolutes.length];

        for (int i = 0; i < absolutes.length; i++) {
            arr[i] = absolutes[i];

            if (!signs[i]) {
                arr[i] *= -1;
            }
            answer += arr[i];
        }
        return answer;
    }
}
