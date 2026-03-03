import java.util.Stack;

class Solution {
    public int maximalRectangle(char[][] matrix) {
        // Base case: if the matrix is empty, the area is 0.
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxRectangleArea = 0;
        
        // This array will store the heights of the histogram for the current row
        int[] heights = new int[cols];
        
        // Process the matrix row by row
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // If it's a '1', increase the height of this column
                if (matrix[i][j] == '1') {
                    heights[j] += 1;
                } else {
                    // If it's a '0', the histogram bar drops to 0 height
                    heights[j] = 0;
                }
            }
            
            // After updating heights for the current row, find the max area for this histogram
            int currentMaxArea = largestRectangleArea(heights);
            maxRectangleArea = Math.max(maxRectangleArea, currentMaxArea);
        }
        
        return maxRectangleArea;
    }
    
    // Helper function: Finds the largest rectangle area in a given histogram
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;
        int n = heights.length;
        
        while (i < n) {
            // If stack is empty or current bar is taller/equal to the bar at stack's top, push index
            if (stack.isEmpty() || heights[stack.peek()] <= heights[i]) {
                stack.push(i);
                i++;
            } else {
                // Current bar is shorter, so we found the right edge for the bar at stack's top.
                // Pop the top bar and calculate the area of the rectangle it forms.
                int poppedIndex = stack.pop();
                int height = heights[poppedIndex];
                
                // If stack is empty, the width is 'i' (it stretches all the way to the left edge).
                // Otherwise, the width is the distance between 'i' and the new top of the stack.
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                
                maxArea = Math.max(maxArea, height * width);
            }
        }
        
        // Process any remaining bars in the stack (these bars extend all the way to the right edge)
        while (!stack.isEmpty()) {
            int poppedIndex = stack.pop();
            int height = heights[poppedIndex];
            int width = stack.isEmpty() ? i : i - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }
        
        return maxArea;
    }
}
