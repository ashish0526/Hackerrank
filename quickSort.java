
public class quickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]  = {10,7,8,9,1,5};
			int n = arr.length;
		quickSort ob = new quickSort();
		ob.sort(arr, 0, n-1);
		System.out.println("sorted array");
		printArray(arr);
		
		
	
		
	}
	
	int partition(int[] arr,int low,int high){
		
		int pivot = arr[high];
		int i = low -1;
		for(int j = low; j<=high-1;j++){
			
			
			if(arr[j]<= pivot ){
				
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			
				
			}
			
				
			
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
		
	}
	
	void sort(int[] arr,int low,int high){
		
		if(high >low){
			
			int pi= partition(arr,low,high);
			sort(arr,low,pi-1);
			sort(arr,pi+1,high);
			
		
			
			
		}
		
		
		
		
	}

	private static void printArray(int[] arr){
		
		int n = arr.length;
		for(int i = 0;i<n;i++)
			System.out.println(arr[i]+ " ");
		System.out.println();
		
		
		
	}
	
	
}
