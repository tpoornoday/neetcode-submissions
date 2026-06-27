class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "");
        String str = result.toLowerCase().strip();
        char[] charArray = str.toCharArray(); 
        for(int i = 0; i< (charArray.length /2);i++){
            if(charArray[i] != charArray[charArray.length - i - 1]) return false;
        }
        return true;
    }
}
