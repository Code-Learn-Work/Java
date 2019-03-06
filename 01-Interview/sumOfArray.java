import java.util.Scanner;
class SumOfArray{
    static int findSum(int arr[]){
        // Base Case
        if(arr.length<=1)
            return arr[0];
        
        // Rec Case
        int n = arr.length;
        int arr1[] = new int[n-1];
        for(int i=0;i<n-1;i++){
            arr1[i] = arr[i];
        }
        int sum = arr[n-1] + findSum(arr1);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Size of Array
        int arr[] = new int[n]; // Array of size n
        // Input array elements
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = findSum(arr);
        System.out.println("The sum of the given array is : " + sum);
        sc.close();
    }
}