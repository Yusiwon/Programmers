package Level2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

class 전화번호목록 {
    public boolean solution(String[] phone_book) {

        Arrays.sort(phone_book, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        HashMap<String, String> map = new HashMap<>();
        for (String str : phone_book) {
            if (map.get(str) != null) {
                return false;
            }
            for (int i = 1; i < str.length(); i++) {
                map.put(str.substring(0, i), "");
            }

        }
        return true;
    }
}
