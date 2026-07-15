import java.util.Arrays;

public class a75 {
    //brute force-0(n)
    public static void sortColors(int[] nums) {
      int count0=0,count1=0,count2=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==0) count0++;
        else if(nums[i]==1) count1++;
        else count2++;
      }
      int index=0;
      while(count0-->0){
        nums[index++]=0;
      }
      while(count1-->0){
        nums[index++]=1;
      }
      while(count2-->0){
        nums[index++]=2;
      }
    }
      //optimized-dutch national flag (using 3 pointers)-0(n)
      public static void sortColorsdnf(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0) {
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
            else mid++;
        }
    }
        public static void swap(int nums[],int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr2={2,0,1};
        sortColorsdnf(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}