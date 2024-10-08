package STRING;

public class String_intern {
    public static void main(String[] args) {
        String s1="Dhruv";
        String s2=new String("Dhruv");
        String s6=new String("Dhruv");
        String s3="Dhruv";
        System.out.println(s1==s3);////true
        System.out.println(s1==s2);   /// false
        System.out.println(s1.equals(s2));  ///true
        String s4=s1.intern();

        System.out.println(s1==s4);   // true
        String s5=s2.intern();
        System.out.println(s2==s5);   //false

        System.out.println(s2==s6);   //false

        String ss1=new String("Dhruv").intern();
        String ss2=new String("Dhruv").intern();
        System.out.println(ss1==ss2);      // true




    }
}
