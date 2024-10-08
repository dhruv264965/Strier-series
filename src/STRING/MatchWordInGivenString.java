package STRING;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchWordInGivenString {

    static void matchWordInGivenstringUsingPatternAndMatcher(String str,String target){
        int count=0;
        Pattern pattern=Pattern.compile(target);
        Matcher matcher= pattern.matcher(str);
        while (matcher.find()){
            count++;
        }
        System.out.println("No Of word "+target+ "  in the string is "+count);
    }

    static int matchWordInGivenstring(String str,String target){
        int count=0;
        int index=0;
        while((index=str.indexOf(target,index))!=-1){
            count++;
            index+=target.length();
        }
        return count;
    }
    static int matchWordInGivenstringUsingSplit(String str,String target){
        String[] parts=str.split("cat");
        int count =parts.length-1;
         return count;
    }

    public static void main(String[] args) {
        String str="dogcat cat dogcatdog";
        String target="cat";
       // matchWordInGivenstringUsingPatternAndMatcher(str,target);
       // System.out.println(matchWordInGivenstring(str,target));
        System.out.println(matchWordInGivenstringUsingSplit(str,target));

    }
}
