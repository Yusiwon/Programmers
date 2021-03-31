package Level1;

import java.util.Arrays;

class 정수내림차순으로배치하기 {
    public long solution(long n) {
        long answer = 0;
        String str = "";
        String number = String.valueOf(n);
        char[] arr = new char[number.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = number.charAt(i);
        }

        Arrays.sort(arr);

        for (int i = arr.length - 1; i > -1; i--) {
            str += arr[i];
        }
        answer = Long.parseLong(str);
        return answer;
    }
}
