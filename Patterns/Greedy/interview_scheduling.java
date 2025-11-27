class Pair<K, V>{
    K start;
    V end;
    
    Pair(K start, V end){
        this.start= start;
        this.end= end;
    }
}

class Result {
  static int intervalScheduling(int[] starts, int[] ends) {
      ArrayList <Pair<Integer, Integer>> arr= new ArrayList<>();
      for(int i=0; i<starts.length; i++){
          arr.add(new Pair<>(starts[i], ends[i]));
      }
      
      int count=0;
      int lastEnd=0;
      Collections.sort(arr, (a, b) -> a.end - b.end);
      
      for(int i=0; i<starts.length; i++){
          if(arr.get(i).start >= lastEnd){
              lastEnd= arr.get(i).end;
              count++;
          }
      }
      
      return count;
  }
}