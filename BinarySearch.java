
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearch ob = new BinarySearch();
		int arr[] = {2,3,4,5,6};
		int n = arr.length;
		int x = 10;
		int result = ob.binarySearch(arr, 0, n-1, x);
		if(result == -1)
			System.out.println("Element not present in the array");
		else
			System.out.println("Element found at index " + result);
		
		
		
	}

	private static int binarySearch(int[] arr,int l,int r,int x){
		
		
		if(r>=l){
			
			int mid = l + (r-l)/2;
			
			if(arr[mid] == x)
				return mid;
			if(arr[mid]  > x)
				return binarySearch(arr,l,mid+1,x);
			return binarySearch(arr,mid+1,r,x);
			
			
			
		
			
		}
		return -1;
		
		
		
		
		
		
	}
	
}
