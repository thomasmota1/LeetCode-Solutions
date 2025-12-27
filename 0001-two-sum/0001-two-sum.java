class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> vistos = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];
            if(vistos.containsKey(complemento)){
                return new int[] { vistos.get(complemento), i };
            }
            
            vistos.put(nums[i], i);
        }
        
        return new int[] {}; 
    }
}
