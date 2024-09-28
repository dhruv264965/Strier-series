package HashMap;

import java.util.HashMap;

public class Anagram {
    public static boolean checkAnagram(String s1, String s2)
    {
        if(s1.length()!=s2.length()) return false;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            if(map.containsKey(s1.charAt(i)))
            {
               map.put(s1.charAt(i),map.get(s1.charAt(i))+1);
            }
            else {
                map.put(s1.charAt(i),1);
            }
        }
        for(int i=0;i<s1.length();i++)
        {
            if(map.containsKey(s1.charAt(i)))
            {
                map.put(s1.charAt(i),map.get(s1.charAt(i))-1);
            }
            else {
                return false;
            }

        }
        for(Character ch:map.keySet())
        {
            if(map.get(ch)!=0)
            {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s1="race";
        String s2="care";
        if(checkAnagram(s1,s2))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
