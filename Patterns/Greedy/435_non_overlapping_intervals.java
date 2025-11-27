class Pair<K, V>{
    K start;
    V end;

    Pair(K start, V end){
        this.start = start;
        this.end= end;
    }
}

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int endTime= Integer.MIN_VALUE;
        int count=0;

        for(int i=0; i<intervals.length; i++){
            if(intervals[i][0] >= endTime){
                endTime= intervals[i][1];
            }else{
                count++;
            }
        }

        return count;
    }
}