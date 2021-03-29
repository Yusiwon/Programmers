package Level1;

class 이진변환반복하기 {
    public int[] solution(String s) {

        int count = 0;
        int zeroCnt = 0;

        while (!s.equals("1")) {
            int one = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    one++;
                } else {
                    zeroCnt++;
                }
            }
            s = Integer.toBinaryString(one);
            count++;
        }
        return new int[]{count, zeroCnt};
    }
}
