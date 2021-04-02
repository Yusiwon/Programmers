package Level2;

import java.util.ArrayList;

class 스킬트리 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < skill.length(); i++) {
            list.add(skill.charAt(i));
        }

        for (int i = 0; i < skill_trees.length; i++) {
            String now = skill_trees[i];
            int index = 0;
            boolean ok = true;
            for (int j = 0; j < now.length(); j++) {
                char ch = now.charAt(j);
                if (list.contains(ch)) {
                    if (list.get(index) == ch) {
                        index++;
                    } else {
                        ok = false;
                        break;
                    }
                }
            }
            if (ok) {
                answer++;
            }
        }

        return answer;
    }
}