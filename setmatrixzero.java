public class setmatrixzero {
    //brute force method 
    // we have first traverse through the array looked which element is zero 
    // than set that as -1 bcoz if we set it as 0 whole array will get changed
    // and after making it -1 just replace -1 with 0 
    //tc :0(mn)(m+n)
    public void setZeroesbruteforce(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    for(int col=0;col<matrix[0].length;col++){
                        if(matrix[i][col]!=0){
                            matrix[i][col]=-1;
                        }
                    }
                    for(int row=0;row<matrix.length;row++){
                        if(matrix[row][j]!=0) matrix[row][j]=-1;
                    }
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==-1) matrix[i][j]=0;
            }
        }
        
    }
//better approach
// now in this we took two arrays and with the help of them we marked whwre the zero is coming
// and after marking it set the rows and colums to zero
// tc:o(mxn) sc(m+n)
    public void setZeroesbetter(int[][] matrix) {
        int rows[]=new int[matrix.length];
        int cols[]=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rows[i]=1;
                    cols[j]=1;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(rows[i] ==1 || cols[j]==1) matrix[i][j]=0;
            }
        }
        
    }
    
    public void setZeroesoptimal(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean firstRow = false;
        boolean firstCol = false;

        // Check first row
        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 0) {
                firstRow = true;
                break;
            }
        }

        // Check first column
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                firstCol = true;
                break;
            }
        }

        // Mark rows and columns
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Fill inner matrix
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }

        // First row
        if (firstRow) {
            for (int j = 0; j < cols; j++)
                matrix[0][j] = 0;
        }

        // First column
        if (firstCol) {
            for (int i = 0; i < rows; i++)
                matrix[i][0] = 0;
        }
    }


public static void main(String[] args) {
    
}

}   
