class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }

        s = s + s;
        if(s.contains(goal)){
            return true;
        }
        return false;
    }
}

/*if(s.length() != goal.length()){
            return false;
        }

        for(int i = 0;i < s.length();i++){
            if(s.equals(goal)){
                return true;
            }

            s = s.substring(1) + s.charAt(0);
        }
        return false;*/