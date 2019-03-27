import java.util.Scanner;

class QuickSort{
    
    public static int partition(int[] arr,int start,int end){
        int pivot = arr[end];
        int count=start-1;
        for(int i=start;i<end;i++){
            if(arr[i]<=pivot){
                count++;

                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
            }
        }
        
        int temp = arr[count+1];
        arr[count+1] = arr[end];
        arr[end] = temp; 
        
        return count+1;
    }
	
    // Recursively Solving Quick Sort
    public static void sort(int arr[],int start,int end){
        // Base Case
        if(start>=end){
            return;
        }
        
        // Rec Case
        int pivot = partition(arr,start,end);
        sort(arr,start,pivot-1);
        sort(arr,pivot+1,end);
    }
    
	public static void quickSort(int[] input) {
		/* Your class should be named Solution
        * Don't write main().
        * Don't read input, it is passed as function argument.
        * No need to print or return the output.
        * Taking input and printing output is handled automatically.
        */
        sort(input,0,input.length-1);
	}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}