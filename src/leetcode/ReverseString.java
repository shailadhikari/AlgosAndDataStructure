package leetcode;

public class ReverseString {
	
	public void reverseString(char[] s) {
        if(s.length <= 1)
            return;
        
        int f = 0;
        int l = s.length-1;
        char c = s[f];
        while(f<l){
            c = s[f];
            s[f] = s[l];
            s[l] = c;
            
            f++;
            l--;
        }
    }

}
