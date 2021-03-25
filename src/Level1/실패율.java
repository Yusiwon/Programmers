package Level1;


class 실패율 {
    public int[] solution(int N, int[] stages) {

        double[] arr = new double[N];

        for (int i = 1; i <= N; i++) {
            int son = 0;
            int mom = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] >= i) {
                    mom++;
                }
                if (stages[j] == i) {
                    son++;
                }
            }
            if (son == 0) {
                arr[i - 1] = 0;
                continue;
            }
            arr[i - 1] = (double) son / (double) mom;
        }

        int[] answer = new int[N];

        for (int i = 0; i < arr.length; i++) {
            double max = -1;
            int index = 0;
            for (int j = 0; j < arr.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    index = j;
                }
            }
            arr[index] = -1;
            answer[i] = index + 1;
        }
        return answer;
    }
}
