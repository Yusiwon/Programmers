package 프로그래머스월간코드챌린지시즌2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution2 {

    public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i) + s.substring(0, i);
            if (stack(str)) {
                answer++;
            }
        }
        return answer;
    }

    public static boolean stack(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (stack.isEmpty()) {
                stack.add(ch);
            } else {
                char st = stack.peek();
                if (st == '[' && ch == ']' || st == '{' && ch == '}' || st == '(' && ch == ')') {

                    stack.pop();
                } else {
                    stack.add(ch);
                }
            }
            if (stack.isEmpty()) {
                System.out.println("비어있음");
            } else {
                System.out.println(stack.peek());
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
}
//class Solution2 {
//
//    static Queue<Character> queue = new LinkedList<>();
//
//    public int solution(String s) {
//        int answer = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            queue.add(s.charAt(i));
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            if (stack()) {
//                answer++;
//            }
//            queue.poll();
//        }
//        return answer;
//    }
//
//    public static boolean stack() {
//        Stack<Character> stack = new Stack<>();
//
//        for (int i = 0; i < queue.size(); i++) {
//            if (stack.isEmpty()) {
//                char ch = queue.poll();
//                stack.add(ch);
//                queue.add(ch);
//            } else {
//                char ch = stack.peek();
//                char now = queue.peek();
//                queue.add(now);
//                if (ch == '[' && now == ']' || ch == '{' && now == '}'
//                        || ch == '(' && now == ')') {
//
//                    stack.pop();
//                } else {
//                    stack.add(now);
//                }
//            }
//        }
//
//        if (stack.isEmpty()) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }
//}
