package Level1;

import java.util.ArrayList;

class 자연수뒤집어배열로만들기 {
    public ArrayList solution(long n) {
        ArrayList<Long> list = new ArrayList<>();

        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }
        return list;
    }
}