package Level1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class 두개뽑아서더하기 {
    public ArrayList solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length-1; i++) {
            int num = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                int ber = numbers[j];

                // 중복을 방지하기 위해서
                if (!list.contains(num + ber)) {
                    list.add(num + ber);
                }
            }
        }

        Collections.sort(list);
        return list;
    }
}
