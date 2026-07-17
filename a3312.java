import java.util.Arrays;

public class a3312 {
    //brute force-0(n^2)
     public int[] gcdValues(int[] nums, long[] queries) {
        int ans[]=new int[queries.length];
        int n=nums.length;
        int gcdpairs[]=new int[n*(n-1)/2];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                gcdpairs[idx++]=gcd(nums[i],nums[j]);
            }
        }
        Arrays.sort(gcdpairs);
        for(int i=0;i<queries.length;i++){
            ans[i]=gcdpairs[(int)queries[i]];
        }
        return  ans;

    }
    public int gcd(int i,int j){
        if(j==0) return i;
        return gcd(j,i%j);
    }
}
