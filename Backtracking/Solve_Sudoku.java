class Result {
    static boolean isSafe(int x, int row, int col, int mat[][]){
        // checking the row
        for(int i=0; i<9; i++){
            if(mat[row][i] == x) return false;
        }
        
        // checking the col
        for(int i=0; i<9; i++){
            if(mat[i][col] == x) return false;
        }
        
        // checking the grid
        int i= row- (row%3);
        int j= col- (col%3);
        for(int k= 0; k<3; k++){
            for(int l=0; l<3; l++){
                if(mat[i+k][j+l] == x) return false;
            }
        }
        
        return true;
    }
    
    static boolean helper(int mat[][], int row, int col){
        if(row == 9) return true;
        if(col == 9){
            return helper(mat, row+1, 0);
        }
        
        if(mat[row][col] != 0){
            return helper(mat, row, col+1);
        }else{
            // fill a value
            for(int i=1; i<10; i++){
                if(isSafe(i, row, col, mat)){
                    mat[row][col] = i;
                    if(helper(mat, row, col+1)) return true;
                    mat[row][col] = 0;
                }
            }
        }
        
        return false;
    }
    
  static int solveSudoku(int mat[][])
  {
      if(helper(mat, 0, 0)){
          return 1;
      }else{
          return -1;
      }
  }
}