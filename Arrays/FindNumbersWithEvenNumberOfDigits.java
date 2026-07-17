class FindNumbersWithEvenNumberOfDigits{
    public static void main(String[] args){
        int[] nums = {12,345,2,6,22,33,44,7896};
        System.out.print(findNumbers(nums));
    }





    public static int findNumbers(int[] nums){
        int count =  0;
        for(int number : nums){
            if (even(number)){
                count++;
            }
        }
        return count;
    }


    public static boolean even(int number){
        int numberOfDigits = digits(number);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }


    public static int digits(int number){
        int count = 0;
        while(number > 0){
                count ++;
                number = number/10;
        }
        return count;
    }

    
}


 