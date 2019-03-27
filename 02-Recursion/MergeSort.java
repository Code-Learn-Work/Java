import java.util.Scanner;

class MergeSort{
    static void merge(int arr[],int mid,int start,int end){
        
        // Length of 2 new Arrays 
        int len1 = mid-start+1;
        int len2 = end-mid;
        
        // 2 new Arrays
        int left[] = new int[len1];
        int right[] = new int[len2];
        
        // Copy data into new Arrays
        for(int i=0;i<len1;i++)
        left[i] = arr[start+i];
        for(int i=0;i<len2;i++)
        right[i] = arr[mid+i+1];
        
        int i=0, j=0;
        int k=start;
        while(i<len1 && j<len2){
            if(left[i]<=right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        
        //Copy remaining data
        while(i<len1){
            arr[k] = left[i];
            k++;
            i++;
        }
        while(j<len2){
            arr[k] = right[j];
            k++;
            j++;
        }
    }
    
    public static void mergeSort(int[] arr,int SI,int EI){
        if(SI<EI){
            int mid = (SI+EI)/2;
            mergeSort(arr,SI,mid);
            mergeSort(arr,mid+1,EI);
            merge(arr,mid,SI,EI);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}