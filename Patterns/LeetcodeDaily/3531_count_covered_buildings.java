class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        int[] maxX= new int[n+1];
        int[] maxY= new int[n+1];
        int[] minX= new int[n+1];
        int[] minY= new int[n+1];
        int size= buildings.length;

        Arrays.fill(minX, Integer.MAX_VALUE);
        Arrays.fill(minY, Integer.MAX_VALUE);

        for(int i=0; i<size; i++){
            int x= buildings[i][0];
            int y= buildings[i][1];

            if(y < minY[x]) minY[x]= y;
            if(y > maxY[x]) maxY[x]= y;
            if(x < minX[y]) minX[y]= x;
            if(x > maxX[y]) maxX[y]= x;
        }

        int count=0;
        for(int i=0; i<size; i++){
            int x= buildings[i][0];
            int y= buildings[i][1];

            if(minX[y] < x && maxX[y] > x && minY[x] < y && maxY[x] > y) count++;
        }

        return count;
    }
}