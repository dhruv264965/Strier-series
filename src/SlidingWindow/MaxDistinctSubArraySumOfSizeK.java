package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;

public class MaxDistinctSubArraySumOfSizeK {
    static int maxDistinctSubArraySumOfSizeKBruteForece(int arr[],int k,int n) {  //T.C.: O(N^2) S.C.: O(N)
     //   int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            int sum=0;
            HashSet<Integer> st=new HashSet<>();
            for(int j=i;j<i+k && j<n;j++){
                if(st.add(arr[j])==false){////if we get duplicate element then break;
                    break;
                }
                sum+=arr[j];
            }
            if(st.size()==k){
                max=Math.max(max,sum);
            }
        }
        return max;
    }
    static int maxDistinctSubArraySumOfSizeK(int arr[],int k,int n){  /////T.C.: O(N) S.C.: O(N)
        int max=0;
        int sum=0;
        int start=0;
        HashMap<Integer,Integer>hp =new HashMap<>();
        for(int i=0;i<n;i++){

            sum+=arr[i];
            hp.put(arr[i],hp.getOrDefault(arr[i],0)+1);
            if(i-start+1==k){
                if(hp.size()==k){
                    max=Math.max(max,sum);
                }
                sum-=arr[start];
                if(hp.get(arr[start])<=1){
                    hp.remove(arr[start]);

                }
                else {
                    hp.put(arr[start],hp.getOrDefault(arr[start],0)-1);
                }
                start++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={1,3,1,4,2};
        int n=5;
        int k=3;
      //  System.out.println(maxDistinctSubArraySumOfSizeKBruteForece(arr,k,n));
        System.out.println(maxDistinctSubArraySumOfSizeK(arr,k,n));
    }
}
