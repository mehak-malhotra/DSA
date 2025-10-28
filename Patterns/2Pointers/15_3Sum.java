// O(n) approach
// extra space complexity- since it uses 2x hashset (for storing lists) 2*O(no of triplets) + O(n) {hashset used to store available elements}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet <List<Integer>> hset= new HashSet<>();
        HashSet <Integer> avl= new HashSet<>();

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int third= -(nums[i]+nums[j]);
                if(avl.contains(third)){
                    List <Integer> l= new ArrayList<>(List.of(nums[i], nums[j], third));
                    Collections.sort(l);
                    hset.add(l);
                }
                avl.add(nums[j]);
            }
            avl.clear();
        }

        List<List<Integer>> ans= new ArrayList<>(hset);
        return ans;
    }
}

// 2 pointer approach
// no extra space required

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List <List<Integer>> triplets= new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j= i+1;
            int k= n -1;
            while(j<k){
                int sum= nums[i]+ nums[j]+ nums[k];
                if(sum == 0){
                    triplets.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j< nums.length && nums[j] == nums[j-1]) j++;
                    while(k>=0 && nums[k] == nums[k+1]) k--;
                }else if(sum < 0){
                    j++;
                }else{
                    k--;
                }
            }
        }

        return triplets;
    }
}