import java.util.Scanner;

public class MergeSort {
	// Function to print the array
	static void printArray(int arr[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}	
	
	// Function to Merge 2 sorted arrays
	static void merge(int arr[],int l,int m,int r) {
		int n1 = m-l+1; // Size of first half
		int n2 = r-m; // Size of second half
		
		// Create 2 empty arrays
		int[] Left = new int[n1];
		int[] Right = new int[n2];
		
		// Copy Data
		for(int i=0;i<n1;i++)
			Left[i] = arr[i];
		
		for(int j=0;j<n2;j++)
			Right[j] = arr[m+1+j];
		
		// Initial index of half arrays
		int i=0,j=0;
		
		// Initial index of merged array
		int k = l;
		
		while(i<n1 && j<n2) {
			if(Left[i]<=Right[j]) {
				arr[k] = Left[i];
				i++;
			}
			else {
				arr[k] = Right[j];
				j++;
			}
			k++;
		}
		
		// Copying remaining elements
		while(i<n1) {
			arr[k] = Left[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			arr[k] = Right[j];
			j++;
			k++;
		}
		
		
	}
	
	// Merge Sort
	static void mergeSort(int[] arr,int l,int r) {
		if(l<r) {
			int m = (l+r)/2; // Find the mid 
			mergeSort(arr,l,m); // Sort first half
			mergeSort(arr,m+1,r); // Sort Second half
			merge(arr,l,m,r); // Merge the sorted arrays
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //Size of Array
		int[] arr = new int[n]; // Array of size n
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		mergeSort(arr,0,n-1);
		printArray(arr,n);
	}

}
