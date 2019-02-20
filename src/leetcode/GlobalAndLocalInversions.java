package leetcode;

public class GlobalAndLocalInversions {
	
	
	public boolean isIdealPermutation(int[] A) {
        for(int i=0; i<A.length; i++){
            if(Math.abs(A[i] - i) > 1) // if the diff between int and index is more than 1 it increses global inversion
                return false;
        }
        return true;
    }

}
