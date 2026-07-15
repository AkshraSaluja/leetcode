public class a53 {
    //brute force-0(n^3)
    public static int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                sum+=nums[k];
                max=Math.max(max,sum);
                }
            }
        }
       return max; 
    }
    //better-0(n^2)
    public static int maxSub(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                max=Math.max(sum,max);
            }
        }
       return max; 
    }
    //optimized-kadane's algorithm -0(n)
    public static int maxSubA(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(sum,max);
            if(sum<0) sum=0;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
       System.out.println( maxSubArray(arr));
       int[] arr2={1};
       System.out.println(maxSub(arr2));
       int arr3[]={5,4,-1,7,8};
       System.out.println(maxSubA(arr3));
    }
}
