package 코테고득점Kit.Brute_force;

import java.util.ArrayList;

class 모의고사 {
    public ArrayList solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int acount = 0;
        int bcount = 0;
        int ccount = 0;

        int aindex = 0;
        int bindex = 0;
        int cindex = 0;

        for (int i = 0; i < answers.length; i++) {
            acount += answers[i] == a[aindex++] ? 1 : 0;
            bcount += answers[i] == b[bindex++] ? 1 : 0;
            ccount += answers[i] == c[cindex++] ? 1 : 0;

            if (aindex == a.length) {
                aindex = 0;
            }
            if (bindex == b.length) {
                bindex = 0;
            }
            if (cindex == c.length) {
                cindex = 0;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        int max = Math.max(acount, bcount);
        max = Math.max(max, ccount);

        if (max == acount) {
            list.add(1);
        }
        if (max == bcount) {
            list.add(2);
        }
        if (max == ccount) {
            list.add(3);
        }

        return list;
    }
}