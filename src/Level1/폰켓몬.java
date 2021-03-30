package Level1;

import java.util.ArrayList;

public class 폰켓몬 {
}
class Solution {

    static boolean[] visit;
    static int goal;
    static int max = 0;

    public int solution(int[] nums) {
        int answer = 0;
        visit = new boolean[nums.length];
        goal = nums.length / 2;

        recursive(nums.length, 0, nums);
        return max;
    }

    public static void recursive(int size, int count, int[] arr) {
        if (goal == count) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < visit.length; i++) {
                if (visit[i] && !list.contains(arr[i])) {
                    list.add(arr[i]);
                }
            }
            if (max < list.size()) {
                max = list.size();
            }
            return;
        }
        for (int i = 0; i < size; i++) {
            if (!visit[i]) {
                visit[i] = true;
                recursive(size, count+1, arr);
                visit[i] = false;
            }
        }
    }
}