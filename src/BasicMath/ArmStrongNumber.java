package BasicMath;

public class ArmStrongNumber {
    static Boolean checkArmstrong(int n){
        int temp;
        int num=n;
        int sum=0;
        int k = String.valueOf(num).length();
        while(n!=0){   //153=3

            temp=n%10;
            sum+= (Math.pow(temp,k));
            n=n/10;
        }
            if(sum==num){
                return true;
            }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkArmstrong(1634));

    }
}
