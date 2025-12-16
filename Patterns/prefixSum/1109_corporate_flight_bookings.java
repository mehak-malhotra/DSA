class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] prefix= new int[n];
        int size= bookings.length;

        for(int i=0; i<size; i++){
            int start= bookings[i][0] - 1;
            int end= bookings[i][1] - 1;
            int seats= bookings[i][2];

            prefix[start] += seats;
            if(end+1 < n) prefix[end+1] -= seats;
        }

        for(int i=1; i < n; i++){
            prefix[i] += prefix[i-1];
        }

        return prefix;
    }
}