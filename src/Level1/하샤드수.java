package Level1;

class 하샤드수 {
    public boolean solution(int x) {

        String str = String.valueOf(x);
        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            n += (int) (str.charAt(i) - '0');
        }

        if (x % n == 0) {
            return true;
        } else {
            return false;
        }

    }
}