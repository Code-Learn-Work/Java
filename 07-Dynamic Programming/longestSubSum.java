import java.util.Scanner;

class LongestSubsequenceSum {

    static int find(int arr[],int n){
        int i,j,max=0;
        int maxArr[] = new int[n];
        
        for(i=0;i<n;i++){
            maxArr[i] = arr[i];
        }
        
        for(i=1;i<n;i++){
            for(j=0;j<i;j++){
                if(arr[i]>arr[j] && maxArr[i]<maxArr[j]+arr[i])
                    maxArr[i] = maxArr[j] + arr[i];
            }
        }
        
        for(i=0;i<n;i++){
            if(max < maxArr[i])
                max = maxArr[i];
        }
        
        return max;
    }
	
    
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = find(arr,n);
        System.out.println(ans);

	}

}