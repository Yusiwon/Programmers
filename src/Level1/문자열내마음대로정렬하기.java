package Level1;

import java.util.Arrays;
import java.util.Comparator;

class 문자열내마음대로정렬하기 {
    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char ch1 = o1.charAt(n);
                char ch2 = o2.charAt(n);

                if (ch1 == ch2) {
                    return o1.compareTo(o2);
                }
                return ch1 - ch2;
            }
        });
        return strings;
    }
}