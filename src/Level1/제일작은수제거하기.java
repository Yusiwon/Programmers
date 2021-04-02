package Level1;

import java.util.ArrayList;

class 제일작은수제거하기 {
    public ArrayList solution(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        if (arr.length == 1) {
            list.add(-1);
        } else {
            int min = getMin(arr);
            for (int i = 0; i < arr.length; i++) {
                if (min == arr[i]) {
                    continue;
                }
                list.add(arr[i]);
            }
        }

        return list;
    }

    public int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }
}