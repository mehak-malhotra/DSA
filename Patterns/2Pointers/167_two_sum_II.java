class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] pair= new int[2];
        int i= 0;
        int j= numbers.length - 1;

        while(i < j){
            if(numbers[i] + numbers[j] == target){
                pair[0] = i+1;
                pair[1] = j+1;
                break;
            }else if(numbers[i] + numbers[j] < target){
                i++;
            }else{
                j--;
            }
        }

        return pair;
    }
}