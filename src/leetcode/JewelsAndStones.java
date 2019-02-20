package leetcode;


import java.util.*;

public class JewelsAndStones {
	
	public int numJewelsInStones(String J, String S) {
        Set<Character> j = new HashSet<Character>();
        int count = 0;
        
        for(char c: J.toCharArray())
            j.add(c);
        
        for(char c : S.toCharArray())
            if(j.contains(c))
                count++;
        
        
        return count;
    }

}
