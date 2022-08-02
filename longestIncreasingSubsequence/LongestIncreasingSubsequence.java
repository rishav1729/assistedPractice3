package longestIncreasingSubsequence;
import java.util.*; 
public class LongestIncreasingSubsequence {
	
	    static int lis(int[] arr, int n)  
	    { 
	        int max = 0; 
	        int[] narr = new int[n]; 

	        Arrays.fill(narr, 1); 

	        for (int i = 1; i < n; i++)  
	        { 
	            for (int j = 0; j < i; j++)  
	            { 
	                if (arr[i] > arr[j] &&  narr[i] < narr[j] + 1) 
	                    narr[i] = narr[j] + 1; 
	            } 
	        } 

	        for (int i = 0; i < n; i++) 
	            if (max < narr[i]) 
	                max = narr[i]; 
	  
	        return max; 
	    } 

	    public static void main(String[] args)  
	    { 
	        int[] arr = { 10, 22, 42, 33, 21, 50, 41, 60,80,3 }; 
	        int n = arr.length; 
	        System.out.println("Length of longestIncreasingSubsequence is " + lis(arr, n)); 
	    } 
	}

