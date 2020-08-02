class Solution {
    public boolean detectCapitalUse(String word) {
        int capital = 0;
        for(char letter : word.toCharArray())
            if(letter >= 'A' && letter <= 'Z')
                capital++;
        
        return capital == word.length() || capital == 0 || capital == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z';
    }
}
