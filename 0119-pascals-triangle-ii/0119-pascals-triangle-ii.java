class Solution {
    public List<Integer> getRow(int rowIndex) {
        List <Integer> ansRow = new ArrayList<>();
        long ans = 1;

        ansRow.add(1);

        for(int colIndex = 1; colIndex <= rowIndex; colIndex++){
            ans = ans * (rowIndex - colIndex + 1); // Here as rowIndex is starting from 0 but we need it to start from 1 so we just add 1 in there, as we have learnt it from 1 base indexing POV 
            ans = ans / colIndex; 

            ansRow.add((int)ans);
        }
        return ansRow;
    }
}