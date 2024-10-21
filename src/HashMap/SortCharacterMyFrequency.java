package HashMap;

import java.util.*;

//O(n log n)	The code iterates through the input string 's' to build a frequency map, which takes O(n) time. Then, it sorts the
// map entries based on frequency in descending order, which takes O(n log n) time. Finally, it constructs the result string by
// iterating through the sorted list, which also takes O(n) time. Therefore, the overall time complexity is O(n log n).
public class SortCharacterMyFrequency {
    static String frequencySort(String s){
        HashMap<Character,Integer> hp=new HashMap<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hp.containsKey(ch)){
                hp.put(ch,hp.get(ch)+1);
            }
            else {
                hp.put(ch,1);
            }
        }
       // System.out.println(hp);
        StringBuilder result = new StringBuilder();
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(hp.entrySet());// create a list and sort the freq
        list.sort((a, b) ->b.getValue()-a.getValue());   // Sort by frequency in descending order

        // Step 3: Print characters in sorted order by frequency
        for (Map.Entry<Character, Integer> entry : list) {
            char character = entry.getKey();
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                result.append(character);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s="tree";
        System.out.println(frequencySort(s));
    }
}
