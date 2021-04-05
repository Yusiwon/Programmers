package Level2;

import java.util.*;

class 튜플 {
    public ArrayList solution(String s) {

        s = s.substring(2, s.length() - 2);
        s = s.replace("},{", " ");
        String[] arr = s.split(" ");

        if (arr.length != 1) {
            Arrays.sort(arr, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if (o1.length() < o2.length()) {
                        return -1;
                    } else if (o1.length() == o2.length()) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            });
        }
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            String[] str = arr[i].split(",");
            for (int j = 0; j < str.length; j++) {
                int num = Integer.parseInt(str[j]);
                if (!list.contains(num)) {
                    list.add(num);
                }
            }
        }


        return list;
    }
}