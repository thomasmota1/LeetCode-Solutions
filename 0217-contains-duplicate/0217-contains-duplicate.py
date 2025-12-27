class Solution(object):
    def containsDuplicate(self, nums):
   
        ehigual = set()
        for x in nums:
            if x in ehigual:
                return True
            ehigual.add(x)
        return False


        