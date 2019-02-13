package leetcode;

import java.util.*;

public class FizzBuzz {
	
	public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        int i = 1;
        String fiz = "Fizz", buz = "Buzz", fizbuz = "FizzBuzz";
        while(i <=n ){
            if(i%3 == 0 && i%5 == 0)
                result.add(fizbuz);
            else if(i%3 == 0)
                result.add(fiz);
            else if(i%5 == 0)
                result.add(buz);
            else
                result.add(Integer.toString(i));
            
            i++;
        }        
        return result;
    }

}
