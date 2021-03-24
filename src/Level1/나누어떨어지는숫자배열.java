package Level1;

import java.util.ArrayList;
import java.util.Collections;

class 나누어떨어지는숫자배열 {
    public ArrayList solution(int[] arr, int divisor) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        // 나누어떨어지는값이 아무것도 없을때의 처리
        if (list.size() == 0) {
            list.add(-1);
        } else { // 오름차순 정렬
            Collections.sort(list);
        }
        return list;
    }
}
