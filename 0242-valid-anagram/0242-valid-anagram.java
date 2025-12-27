import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> contagem = new HashMap<>();
        for (char c : s.toCharArray()) {
            contagem.put(c, contagem.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            int atual = contagem.getOrDefault(c, 0);
            
            if (atual == 0) {
                return false; 
            }
            
            contagem.put(c, atual - 1);
        }

        return true;
    }
}