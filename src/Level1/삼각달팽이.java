package Level1;

import java.util.ArrayList;

class 삼각달팽이 {
    public ArrayList solution(int n) {
        int[][] arr = new int[n][n];

        int number = 1;
        int row = -1;
        int col = 0;
        while (true) {
            for (int i = 0; i < n; i++) {
                row++;
                arr[row][col] = number++;
            }
            n--;
            if(n == 0) break;

            for (int i = 0; i < n; i++) {
                col++;
                arr[row][col] = number++;
            }
            n--;
            if(n == 0) break;

            for (int i = 0; i < n; i++) {
                row--;
                col--;
                arr[row][col] = number++;
            }
            n--;
            if(n == 0) break;
        }

        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    break;
                }
                answer.add(arr[i][j]);
            }
        }
        return answer;
    }
}
