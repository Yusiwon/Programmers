package Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            // 해당 숫자를 2진수로 바꾸어준다.
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            String line = answer[i];
            while (line.length() < n) {
                line = "0" + line;
            }
            line = line.replace("1", "#");
            answer[i] = line.replace("0", " ");
        }
        return answer;
    }

}
