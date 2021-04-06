package Level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        m = m.replace("C#", "c").replace("D#", "d")
                .replace("F#", "f").replace("G#", "g")
                .replace("A#", "a").replace("E#", "e");

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < musicinfos.length; i++) {
            String[] info = musicinfos[i].split(",");
            String[] start = info[0].split(":");
            String[] end = info[1].split(":");

            // get play time
            int startH = Integer.parseInt(start[0]);
            int startM = Integer.parseInt(start[1]);
            int endH = Integer.parseInt(end[0]);
            int endM = Integer.parseInt(end[1]);

            endH -= startH;
            endM -= startM;
            endM += 60 * endH;

            // check song
            String result = "";
            String song = info[3].replace("C#", "c").replace("D#", "d")
                    .replace("F#", "f").replace("G#", "g")
                    .replace("A#", "a").replace("E#", "e");
            ;
            for (int j = 0; j < endM; j++) {
                char add = song.charAt(j % song.length());
                result += add;
            }

            if (result.contains(m)) {
                String add = info[2] + "," + endM;
                list.add(add);
            }
        }

        // sorting and return song title
        if (list.size() == 0) {
            return "(None)";
        } else if (list.size() > 1) {
            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    int time1 = Integer.parseInt(o1.split(",")[1]);
                    int time2 = Integer.parseInt(o2.split(",")[1]);

                    if (time1 == time2) {
                        return -1;
                    } else {
                        return time2 - time1;
                    }
                }
            });
        }

        String title = list.get(0).split(",")[0];
        return title;

    }
}