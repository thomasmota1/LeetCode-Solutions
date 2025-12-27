class Solution(object):
    def isAnagram(self, s, t):
        anam = {}
        if len(s) != len(t):
            return False
        contagem = {}
        for letra in s:
            
            contagem[letra] = contagem.get(letra, 0) + 1
        for letra in t:
            if contagem.get(letra, 0) == 0:
                return False
            
            contagem[letra] -= 1

        return True
            