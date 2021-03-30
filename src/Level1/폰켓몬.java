package Level1;

import java.util.ArrayList;
import java.util.HashSet;

public class 폰켓몬 {
}
class Solution {

    public int solution(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        return set.size() > nums.length/2 ? nums.length/2:set.size();
    }

}