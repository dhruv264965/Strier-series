package BasicMath;

public class ReverseInteger {

    //Example 1:
    //
    //Input: x = 123
    //Output: 321
    //Example 2:
    //
    //Input: x = -123
    //Output: -321
    //Example 3:
    //
    //Input: x = 120
    //Output: 21

    public static int reverse(int x) {
        int temp;
        int num=x;
        int sum=0;
        while(x!=0){
            if(sum<Integer.MAX_VALUE /10  || sum>Integer.MIN_VALUE /10){
                return  0;
            }

            temp=x%10;  //123

                sum=(sum*10)+temp;
                x=x/10;


        }

        return sum;

    }
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));

    }
}
