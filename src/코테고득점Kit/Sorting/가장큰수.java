package Sorting;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

class 가장큰수 {
    public String solution(int[] numbers) {

        String[] temp = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            temp[i] = String.valueOf(numbers[i]);
        }

        //내림차순으로 정렬
        Arrays.sort(temp, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        // 입력으로 [0, 0, 0, 0]이 들어오게 되는 경우
        // 정렬을 마친 배열이므로 가장 큰값이 0인 경우
        if (temp[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp.length;i++) {
            sb.append(temp[i]);
        }

        return sb.toString();
    }
}
