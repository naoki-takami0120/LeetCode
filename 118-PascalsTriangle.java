class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>());
        
        triangle.get(0).add(1);
        
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> currRow = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);
            
            currRow.add(1);
            for (int col = 1; col < prevRow.size(); col++) {
                currRow.add(prevRow.get(col) + prevRow.get(col - 1));
            }
            currRow.add(1);
            triangle.add(currRow);
        }
            
        return triangle;
    }
}