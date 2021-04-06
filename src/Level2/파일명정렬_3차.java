package Level2;

import java.util.Arrays;
import java.util.Comparator;

class 파일명정렬_3차 {
    public String[] solution(String[] files) {

        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String head1 = o1.split("[0-9]")[0];
                String head2 = o2.split("[0-9]")[0];

                String num1 = o1.replace(head1, "");
                String num2 = o2.replace(head2, "");
                head1 = head1.toUpperCase();
                head2 = head2.toUpperCase();

                int compareResult = head1.compareTo(head2);
                if (compareResult == 0) {

                    String result1 = "";

                    for (char ch : num1.toCharArray()) {
                        if ('0' <= ch && ch <= '9') {
                            result1 += ch;
                        } else {
                            break;
                        }
                    }

                    String result2 = "";
                    for (char ch : num2.toCharArray()) {
                        if ('0' <= ch && ch <= '9') {
                            result2 += ch;
                        } else {
                            break;
                        }
                    }

                    return Integer.parseInt(result1) - Integer.parseInt(result2);
                } else {
                    return compareResult;
                }
            }
        });
        return files;
    }
}