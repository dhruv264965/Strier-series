package ARRAY;

public class FindMaxConsectiveOnces {
    static int maxConsecutiveOnes(int []arr) {
        int final_consec_Once = 0, curr_consec_Once = 0;
        for (int num : arr) {
            if(num==1) curr_consec_Once+=1;
            else curr_consec_Once=0;
            final_consec_Once=Math.max(final_consec_Once,curr_consec_Once);

        }
        return final_consec_Once;
    }
    public static void main(String[] args) {
        int[] arr={0,1,1,0,1,1,1,2,2,2,2,2,2};

        System.out.println(maxConsecutiveOnes(arr));

    }
}
