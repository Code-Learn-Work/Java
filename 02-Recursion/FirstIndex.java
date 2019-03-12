import java.util.Scanner;
class FirstIndex{
    public static int firstIndex(int arr[],int x,int i){
        // Base Case
        if(i==arr.length){
            return -1;
        }
        else if(arr[i]==x){
            return i;
        }

        // Rec Case
        return firstIndex(arr, x, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(firstIndex(arr,x,0));
        sc.close();
    }
}