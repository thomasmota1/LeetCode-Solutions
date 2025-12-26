class Solution(object):
    def countBits(self, n):
        ans = []
        for i in range(n + 1):
            cont = 0
            temp = i  
            while temp > 0:
                if temp % 2 == 1:
                    cont += 1
                temp //= 2
            ans.append(cont)
        return ans