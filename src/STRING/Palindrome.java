package STRING;

public class Palindrome {
    public static boolean ispalindrome(String str)
    {
        boolean flag=true;
        for (int i = 0, j = str.length() - 1; i<=j ; i++, j--) {
            if (str.charAt(i) !=str.charAt(j))
            {
                flag=false;
            }
            }
        return flag;

    }

    public static void main(String[] args) {
        String str="abbsa";
        System.out.println(ispalindrome(str));
    }

}
