import java.util.Arrays;

public class a3876 {
    //brute force - o(n log n)
    public static long gcdSum(int[] nums) {
        int n=nums.length;
        int [] prefixgcd=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);
            prefixgcd[i]=gcd(nums[i],max);
        }
        Arrays.sort(prefixgcd);
        long sum=0;
        int i=0,j=nums.length-1;
        while(i<j){
            sum+=gcd(prefixgcd[i],prefixgcd[j]);
            i++;
            j--;
        }
        return sum;
        
    }
    static int gcd(int i,int j){
        if(j==0) return i;
        return gcd(j,i%j);
    }
    public static void main(String[] args) {
        int nums[]={3,6,8,2};
        System.out.println(gcdSum(nums));
    }
}
