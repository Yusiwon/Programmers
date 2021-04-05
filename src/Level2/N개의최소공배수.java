package Level2;


class N개의최소공배수 {
    public int solution(int[] arr) {
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int a = Math.max(answer, arr[i]);
            int b = Math.min(answer, arr[i]);

            answer = csg(a, b, cdg(a, b));
        }
        return answer;
    }

    public int cdg(int a, int b) {
        while (b > 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    public int csg(int a, int b, int cdg) {
        int result = (a * b) / cdg;
        return result;
    }
}