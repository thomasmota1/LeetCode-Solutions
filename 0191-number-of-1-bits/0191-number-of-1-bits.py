class Solution(object):
    def hammingWeight(self, n):
        num1 = 0
        while n > 0:
            if n % 2 == 1:
                num1 += 1
            n = n// 2  
        return num1


        