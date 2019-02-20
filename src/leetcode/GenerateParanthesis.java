package leetcode;
import java.util.*;

public class GenerateParanthesis {
	public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        
        paranthesisHelper(n, "", result, 0, 0);
        
        return result;
    }
    
    public void paranthesisHelper(int n, String str, List<String> result, int open, int close){
        if(str.length() == 2*n){
            result.add(str);
            return;
        }  
        
        //generating open braces
        if(open < n)
            paranthesisHelper(n, str+"(", result, open+1, close);
        
        //close the braces, if close count is less than open count
        if(close < open)
            paranthesisHelper(n, str+")", result, open, close+1);
        
    }
    
}
