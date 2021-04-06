package Level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        m = m.replace("C#", "c").replace("D#", "d")
                .replace("F#", "f").replace("G#", "g")
                .replace("A#", "a");

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
            endM -=startM;
            endM += 60 * endH;

            // check song
            String result = "";
            String song = info[3].replace("C#", "c").replace("D#", "d")
                    .replace("F#", "f").replace("G#", "g")
                    .replace("A#", "a");;
            for (int j = 0; j < endM; j++) {
                char add = song.charAt(j % song.length());
                result += add;
            }

            if (result.contains(m)) {
                String add = musicinfos[2] + "," + endM;
                list.add(add);
            }
        }

//        // sorting and return song title
//        if (list.size() == 0) {
//            return "(none)";
//        } else if(list.size() > 1){
//            Collections.sort(list, new Comparator<String>() {
//                @Override
//                public int compare(String o1, String o2) {
//                    int time1 = Integer.parseInt(o1.split(",")[1]);
//                    int time2 = Integer.parseInt(o2.split(",")[1]);
//
//                    if (time1 == time2) {
//                        return -1;
//                    } else {
//                        return time1 - time2;
//                    }
//                }
//            });
//
//        }
        if (list.size() == 0) {
            return "none";
        } else {
            String title = list.get(0).split(",")[0];
            return title;
        }

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String m = "ABCDEFG";
        String[] musicinfos = {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"};
        System.out.println(s.solution(m, musicinfos));

    }
}