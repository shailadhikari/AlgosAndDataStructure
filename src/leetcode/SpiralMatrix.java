package leetcode;

import java.util.*;

public class SpiralMatrix {
	
	public List<Integer> spiralOrder(int[][] matrix) {
        int rowCount = matrix.length;
        if(rowCount == 0)
            return new ArrayList<Integer>();
        
        int colCount = matrix[0].length;
        if(colCount == 0)
            return new ArrayList<Integer>();
        
        int rStart = 0;
        int cStart = 0;
        
        
        List<Integer> spiral = new ArrayList<Integer>();
        
        spiralHelper(rStart, cStart, rowCount,colCount, spiral, matrix);
        
        return spiral;
    }
    
    public void spiralHelper(int rStart, int cStart, int rowCount, int colCount, List<Integer> spiral, int[][] matrix){
        int rEnd = rStart+rowCount-1;
        int cEnd = cStart+colCount-1;
        
        if(rowCount < 1 || colCount < 1)
            return;
        
        if(rowCount == 1 && colCount == 1){
            spiral.add(matrix[rStart][cStart]);
            return;
        }
        
        //for colCount add from start for row
        for(int i=cStart; i<=cEnd; i++)
            spiral.add(matrix[rStart][i]);
        
        //for rowCount add from top for col
        for(int i=rStart+1; i<=rEnd; i++)
            spiral.add(matrix[i][cEnd]);
        
        if(rowCount == 1 || colCount == 1)
            return;
        
        //for colCount add from end for row
        for(int i=cEnd-1; i>=cStart; i--)
            spiral.add(matrix[rEnd][i]);
        
        //for rowCount-1 add from bottom for col
        for(int i=rEnd-1; i>=rStart+1; i--)
            spiral.add(matrix[i][cStart]);
        
        spiralHelper(rStart+1, cStart+1, rowCount-2, colCount-2, spiral, matrix);   
    }

}
