class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        igual = {} 
        for num in nums:
            igual[num] = igual.get(num, 0) + 1
        ordenados = sorted(igual.keys(), key=lambda x: igual[x], reverse=True)
    
        return ordenados[:k]
        

        
        