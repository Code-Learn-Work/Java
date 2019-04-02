package recursion;

public class BinarySearch {
	public static int binarySearch(int arr[], int start, int end, int target) 
    { 
        if (end >= start) { 
            int mid = start + (end - start) / 2; 
  
            if (arr[mid] == target) 
                return mid; 
  
            if (arr[mid] > target) 
                return binarySearch(arr, start, mid - 1, target); 
  
            
            return binarySearch(arr, mid + 1, end, target); 
        } 
  
        return -1; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,4,5,6,7};
		int ans = binarySearch(arr, 0, arr.length-1, 5);
		System.out.println(ans);
	}

}
