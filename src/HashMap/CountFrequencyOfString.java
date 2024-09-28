package HashMap;

import java.util.HashMap;

public class CountFrequencyOfString {
    static void countFreqOfString(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') { //if we are not counting space
                if (map.containsKey(str.charAt(i))) {
                    map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                } else
                    map.put(str.charAt(i), 1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        countFreqOfString("hellohow dhruv");
    }
}
