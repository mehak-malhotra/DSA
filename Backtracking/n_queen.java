class Result 
{
// Complete this function to check placing queen at board[row][col] is safe or not by checking current row, left diagonal & right diagonal.
    ArrayList <Integer> createArray(int board[][], int n){
        ArrayList <Integer> al= new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == 1){
                    al.add(j);
                }
            }
        }
        return al;
    }
    
    int isSafe(int board[][], int row, int col, int n){ 
        // check row
        for(int i=0; i<col; i++){
            if(board[row][i] == 1) return 0;
        }
        
        // check left diagonal
        int i= row;
        int j= col;
        while(i>= 0 && j>=0){
            if(board[i][j] == 1) return 0;
            i--;
            j--;
        }
        
        // check right diagonal
        i= row;
        j= col;
        while(i<n && j>=0){
            if(board[i][j] == 1) return 0;
            i++;
            j--;
        }
        
        return 1;
    } 
    
  void backtrack(int board[][], int col, int n, ArrayList<ArrayList<Integer>> sol){
      if(col == n){
          ArrayList <Integer> al= createArray(board, n);
          sol.add(al);
          return;
      }
      
      for(int i=0; i<n; i++){
          if(isSafe(board, i, col, n) == 1){
              board[i][col]= 1;
              backtrack(board, col+1, n, sol);
              board[i][col]= 0;
          }
      }
  }

// Complete this function to solve the problem and save the answers in sol ArrayList as required.
  boolean solveNQUtil(int board[][], int col, int n, ArrayList<ArrayList<Integer>> sol){ 
      backtrack(board, 0, n, sol);
      return sol.size() != 0;
  } 
}