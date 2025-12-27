class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>visto = new HashSet<>();
        for(int n : nums){
            if(visto.contains(n)){

                return true;
            }
            visto.add(n);
        }
        return false;
    }
}