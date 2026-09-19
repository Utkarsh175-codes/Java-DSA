class Solution {
    public String removeOccurrences(String s, String part) {

        while(s.contains(part)){
            // search part inside s
            int index = s.indexOf(part);

            // create a new string s by concatenating the left and right side of 'part' substring 
            s = s.substring(0,index) + s.substring(index + part.length());
        }
        return s;

    } 
}