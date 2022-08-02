//Writing a program in Java for array rotation
package assistedPractice3;

import java.util.*;

	class ArrayRotation { 
		
		
		public void rotate(int[] nums, int k) {
		    		if(k > nums.length) 
		       			k=k%nums.length;
		 		int[] result = new int[nums.length];
		 		for(int i=0; i < k; i++){
		        			result[i] = nums[nums.length-k+i];
		 		}
		 		int j=0;
		    		for(int i=k; i<nums.length; i++){
		        			result[i] = nums[j];
		j++;
		    		}
		 		System.arraycopy( result, 0, nums, 0, nums.length );
		}
		
		
			public static void main(String[] args) {
				 Scanner sc = new Scanner (System.in);
				 int n,arr[],k,i;
				 System.out.println("enter size of array");
				 n = sc.nextInt();
				 arr= new int[n];
				 System.out.println("enter the elements of array");
				 for (i=0;i<n;i++)
				 {
					 
					 arr[i]=sc.nextInt();
				 }
				 System.out.println("enter k value");
				 k = sc.nextInt();
				ArrayRotation r = new ArrayRotation();
		        		
		        		r.rotate(arr, k); 
		        		for( i=0;i<arr.length;i++){
		            			System.out.print(arr[i]+" ");
		        		
		        		}
			
		}

}
