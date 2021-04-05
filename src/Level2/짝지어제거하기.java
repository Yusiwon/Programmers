package Level2;

import java.util.Stack;

class 짝지어제거하기
{
    public int solution(String s)
    {
        int answer = 0;

        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == arr[i]) {
                stack.pop();
            } else {
                stack.add(arr[i]);
            }
        }

        if (stack.isEmpty()) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}