package Level2;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class 오픈채팅방 {
    public String[] solution(String[] record) {

        Map<String, String> map = new HashMap<>();
        String[] idlog = new String[record.length];
        String[] printlog = new String[record.length];

        int index = 0;
        for (int i = 0; i < record.length; i++) {
            StringTokenizer st = new StringTokenizer(record[i], " ");
            String command = st.nextToken();
            String id = st.nextToken();

            if (command.equals("Enter")) {
                String name = st.nextToken();
                idlog[index] = id;
                printlog[index] = "님이 들어왔습니다.";
                map.put(id, name);
                index++;
            } else if (command.equals("Leave")) {
                idlog[index] = id;
                printlog[index] = "님이 나갔습니다.";
                index++;
            } else if (command.equals("Change")) {
                String name = st.nextToken();
                map.put(id, name);
            }
        }

        String[] answer = new String[index];
        for (int i = 0; i < index; i++) {
            answer[i] = map.get(idlog[i]) + printlog[i];
        }
        return answer;
    }
}