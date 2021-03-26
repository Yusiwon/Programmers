package Level1;

class 키패드누르기 {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        int left = 10;  // *위치
        int right = 12; // #위치

        StringBuilder sb = new StringBuilder();
        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) { // 왼손일 경우
                sb.append("L");
                left = num;
            } else if (num == 3 || num == 6 || num == 9) { // 오른손일 경우
                sb.append("R");
                right = num;
            } else { // 중간일 경우
                int leftDis = getDistance(left, num);
                int rightDis = getDistance(right, num);

                if (leftDis < rightDis) {
                    sb.append("L");
                    left = num;
                } else if (leftDis > rightDis) {
                    sb.append("R");
                    right = num;
                } else {
                    if (hand.equals("left")) {
                        sb.append("L");
                        left = num;
                    } else if(hand.equals("right")) {
                        sb.append("R");
                        right = num;
                    }
                }
            }
        }
        return sb.toString();
    }

    public static int getDistance(int index, int num) {
        index = (index == 0) ? 11 : index;
        num = (num == 0) ? 11 : num;

        int x = (index - 1) / 3;
        int y = (index - 1) % 3;
        int midX = num / 3;
        int midY = 1;

        int distance = Math.abs(midX - x) + Math.abs(midY - y);
        return distance;
    }
}