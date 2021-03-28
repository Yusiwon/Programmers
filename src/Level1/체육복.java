package Level1;

import java.util.Arrays;

class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] arr = new int[n+1];
        Arrays.fill(arr, 1);
        arr[0] = 0;

        for (int i = 0; i < lost.length; i++) {
            arr[lost[i]]--;
        }
        for (int i = 0; i < reserve.length; i++) {
            arr[reserve[i]]++;
        }

        for (int i = 1; i < n+1; i++) {
            if (arr[i] == 0) {
                if (i != 0 && arr[i - 1] == 2) {
                    arr[i-1]--;
                    arr[i]++;
                } else if (i != n && arr[i + 1] == 2) {
                    arr[i+1]--;
                    arr[i]++;
                }
            }

            if (arr[i] > 0) {
                answer++;
            }
        }
        return answer;
    }
}
