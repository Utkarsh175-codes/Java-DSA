class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();
        
        for(int i = 0;i < s.length();i++){
            char currentChar = s.charAt(i);
            
            // If the rightmost character in our answer matches our current character then delete the rightmost character  
            if(ans.length() > 0 && ans.charAt(ans.length() - 1) == currentChar){
                ans.deleteCharAt(ans.length() - 1);
            }
            else{
                ans.append(currentChar);
            }
        }
        return ans.toString();
    }
}