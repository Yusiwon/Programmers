package Level1;

import java.lang.reflect.Array;
import java.util.*;

public class 같은숫자는싫어{
    public ArrayList solution(int []arr) {

        ArrayList<Integer> list = new ArrayList<>();
        int pre = -1;
        for (int i = 0; i < arr.length; i++) {
            if (pre == arr[i]) {
                continue;
            }

            list.add(arr[i]);
            pre = arr[i];
        }
        return list;
    }
}
