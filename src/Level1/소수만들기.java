package Level1;


class 소수만들기 {

    public int solution(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i + 1; j < nums.length-1; j++) {
                for (int l = j + 1; l < nums.length; l++) {
                    int sum = nums[i] + nums[j] + nums[l];
                    if(isPrime(sum)) count++;
                }
            }
        }
        return count;
    }

    public boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}