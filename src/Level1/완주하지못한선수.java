package Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

class 완주하지못한선수{
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                return answer;
            }
        }
        if (i == participant.length - 1) {
            answer = participant[i];
        }
        return answer;
    }
}
