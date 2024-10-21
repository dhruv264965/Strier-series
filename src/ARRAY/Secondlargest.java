package ARRAY;

public class Secondlargest {
    static int secondLargest(int arr[]){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
        }
        return max2;
    }
    public static void main(String[] args) {
        int arr[]={4,2,66,43,2,66,99,6,4};
        System.out.println(secondLargest(arr));
    }
}
