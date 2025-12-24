class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int mini= 0;
        int sum= 0;
        Arrays.sort(capacity);

        int i= 0;
        int j= capacity.length - 1;
        while(i< j){
            int temp= capacity[i];
            capacity[i]= capacity[j];
            capacity[j]= temp;
            i++;j--;
        }

        for(int k: apple){
            sum += k;
        }

        i=0;
        while(sum > 0){
            sum -= capacity[i];
            mini++;
            i++;
        }

        return mini;
    }
}