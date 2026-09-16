class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;
        
        // Main loop 
        while(i >= 0){
            // Remove all trailinng spaces 
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }
            
            // Find the start index of the word 
            int j = i;
            while(j >= 0 && s.charAt(j) != ' '){
                j--;
            }
            // Jaise hi j space pr ayega to ruk jayega 
            //  Tab hum uss pure word ko ans me append kar lenge

            ans.append(s.substring(j+1, i+1));

            // Now remove faltu space where j is standing
            while(j >= 0 && s.charAt(j) == ' '){
                j--;
            } 

            if(j >= 0){
                ans.append(' ');
            }
            // i ko bhi usi index pe leke aao second word ke end pe 
            i = j;
        }
        return ans.toString();
    }
}   