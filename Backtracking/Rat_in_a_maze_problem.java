class Result {
    static int count=0;
    static void helper(int maze[][], int row, int col, int size){
        // base 1
        if(row == size-1 && col == size-1){
            count++;
            return;
        }
        
        if(row >= size || col >= size) return;
        
        // base 2
        if(maze[row][col] == -1) return;
        
        // go right
        helper(maze, row, col+1, size);
        
        //go down
        helper(maze, row+1, col, size);
    }
    
  public static int solveMaze(int maze[][], int size) {
      helper(maze, 0, 0, size);
      return count;
  }
}

