package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer>l=new ArrayList<>();
        l.add(5);
        l.add(10);
        l.add(3);
        l.add(51);
        l.add(56);
        System.out.println(l);
        l.sort(Comparator.reverseOrder());
        System.out.println(l);
        System.out.println(l.get(0));
        System.out.println(l.get(l.size()-1));
        l.add(2,48);
        System.out.println(l);
     //   l.get(l.lastIndexOf(l));
        System.out.println("-------------------------------------------------------------------------");
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        // Print the list
        System.out.println(list_Strings);
        // Update the third element with "Yellow"
        list_Strings.set(2, "Yellow");
        // Print the list again
        System.out.println(list_Strings);
        System.out.println("--------------------------------------------------------------");

        List<String> list_Stringss = new ArrayList<String>();
        list_Stringss.add("Red");
        list_Stringss.add("Green");
        list_Stringss.add("Orange");
        list_Stringss.add("White");
        list_Stringss.add("Black");
        // Print the list
        System.out.println(list_Stringss);
        // Remove the third element from the list.
        list_Stringss.remove(2);
        // Print the list again
        System.out.println("After removing third element from the list:\n"+list_Stringss);
        if(list_Stringss.contains("Red")){
            System.out.println("found");
        }
        else System.out.println("not found");

        System.out.println("List before sort: "+list_Stringss);
        Collections.sort(list_Stringss);
        System.out.println("List after sort: "+list_Stringss);

        System.out.println("----------------------------------");

        System.out.println("List before reversing :\n" + list_Stringss);
        Collections.reverse(list_Stringss);
        System.out.println("List after reversing :\n" + list_Stringss);
        System.out.println("--------------------------------------");
        System.out.println("Original list: " + list_Strings);
        List<String> sub_List = list_Strings.subList(0, 3);
        System.out.println("List of first three elements: " + sub_List);
    }
}
