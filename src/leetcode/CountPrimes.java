package leetcode;

public class CountPrimes {
	
	
	public int countPrimes(int n) {
        
        if(n<=2)
            return 0;
        
        boolean isComp[] = new boolean[n];
        
        int count = 1;
        
        int sqrt = (int)Math.sqrt(n);
        for(int i=3; i<n; i+=2){ //need to check till n, look for odds
            if(isComp[i])
                continue;
            
            count++;
            
            if(i>sqrt)// need to update till the square root of n, as the multiples get covered
                continue;
            
            for(int j=i*i; j<n; j+=i*2) //update the multiples of i, which are not divisible by 2
                isComp[j] = true;
        }
        
        return count;
       
    }
}
