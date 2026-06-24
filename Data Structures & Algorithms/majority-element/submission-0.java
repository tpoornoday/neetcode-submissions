class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxcount = 0;
        int sol = 0; 
        for(int i = 0 ; i< nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
            if(map.get(nums[i]) > maxcount){
                sol = nums[i];
                maxcount = map.get(nums[i]);
            }

            if(maxcount > (nums.length/2)) return nums[i];
        }
        return sol;
    }
}