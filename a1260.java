public class a1260{
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        int m=grid.length;
        int n=grid[0].length;
        int arr[][]=new int[m][n];
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                int newval=(r*n+c+k)%(m*n);
                int newr=newval/n,newc=newval%n;
                arr[newr][newc]=grid[r][c];
            }
        } 
       
        for(int r=0;r<m;r++){
            List<Integer>tmp=new ArrayList<>();
            for(int c=0;c<n;c++){
                tmp.add(arr[r][c]);
            }
            ans.add(tmp);
        }       
        return ans;
    }
    public static void main(String[] args) {
        
    }

}