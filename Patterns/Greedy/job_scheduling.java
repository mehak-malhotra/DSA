class Pair<K, V>{
    K deadline;
    V profit;
    
    Pair(K deadline, V profit){
        this.deadline= deadline;
        this.profit= profit;
    }
}

class Result {
  static int maximum(int[] deadlines){
      int maxi=0;
      for(int i=0; i<deadlines.length; i++){
          maxi= Math.max(maxi, deadlines[i]);
      }
      return maxi;
  }
    
  static int jobScheduling(int[] deadlines, int[] profits) {
      ArrayList <Pair<Integer, Integer>> arr= new ArrayList<>();
      for(int i=0; i<profits.length; i++){
          arr.add(new Pair<>(deadlines[i], profits[i]));
      }
      
      Collections.sort(arr, (a, b) -> b.profit -  a.profit);
      int pft=0;
      int[] sch= new int[maximum(deadlines)];
      
      for(int i=0; i<profits.length; i++){
          int ind= arr.get(i).deadline - 1;
          while(ind >= 0 && sch[ind] != 0) ind--;
          if(ind >= 0){
              sch[ind]= arr.get(i).profit;
              pft+= sch[ind];
          } 
          
      }
      
      return pft;
  }
}