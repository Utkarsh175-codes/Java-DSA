class Solution {
    public int compress(char[] chars) {
        int readIndex = 0;
        int writeIndex = 0;
        
        while(readIndex < chars.length){
            int count = 0;
            char currentChar = chars[readIndex];

            // Here we check if same digits and increment count accordingly
            while(readIndex < chars.length && chars[readIndex] == currentChar){
                readIndex++;
                count++;
            }

            // Now we will insert that particular letter and its count one by one ok 

            // 1. Soo to insert the letter we do this 
            chars[writeIndex] = currentChar;
            writeIndex++;

            // 2. And now we insert the count but wait 
            // If the count is 1 dont write 1 but from 2 and so on we can print the count 
            // And the count should be converted do string first and then write that in the array as it is an character array 

            if(count > 1){  // This makes sure we do not print 1 count 
                String countStr = String.valueOf(count); // converted int to string 
                for(char digit : countStr.toCharArray()){
                    chars[writeIndex] = digit;
                    writeIndex++;
                }
            }
        }
        return writeIndex; // writeIndex is one ahead of the compressed loop so it perfectly gives the length 
    }
}

