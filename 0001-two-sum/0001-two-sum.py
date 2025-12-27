class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        _map = {}
        i = 0
        indice = 0
        while i < len(nums):
            atual = nums[i]
            complemento = target - nums[i]
            if complemento in _map:
                indice = _map[complemento]
                return [i,indice]
            _map[atual] = i
            i +=1
            


                    
        

        