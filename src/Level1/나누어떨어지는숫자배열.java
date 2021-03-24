package Level1;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList solution(int[] arr, int divisor) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        if (list.size() == 0) {
            list.add(-1);
        } else {
            Collections.sort(list);
        }
        return list;
    }
}
