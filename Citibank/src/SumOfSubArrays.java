
public class SumOfSubArrays {

	public static long SubArraySum(int arr[], int n) {

		/*int arr1[] = { 10, 20, 30};
		int arr2[] = new int[10];
		int k=0;
		//int j =1;
		for (int i = 0; i < arr1.length;i++) {
			if(i != arr1.length-1) {
				for(int j=0;j<arr1.length-1;j++) {
					//if(j != arr1.length) {
					arr2[k] = arr1[i] + arr1[j+1];
					System.out.println(arr2[k]);
					k++;
					//}
				}
				//j++;
				}
				else {
			
					arr2[arr1.length-1] = arr1[0] + arr1[arr1.length-1];
					System.out.println(arr2[arr1.length-1]);
				}
			
		}
		*/
		
		long result = 0; 
	       
        // Pick starting point 
        for (int i = 0; i < n; i ++) 
        { 
            // Pick ending point 
            for (int j = i; j < n; j ++) 
            { 
                // sum subarray between current 
                // starting and ending points 
                for (int k = i; k <= j; k++) 
                	System.out.println(result += arr[k]) ; 
            } 
        } 
        return result ; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		/*SumOfSubArrays s = new SumOfSubArrays();
		//s.sum();*/
		
		int arr[] = {1, 2, 3} ; 
        int n = arr.length; 
        System.out.println("Sum of SubArray : " +  
                          SubArraySum(arr, n)); 
        
        
        
	}

}
