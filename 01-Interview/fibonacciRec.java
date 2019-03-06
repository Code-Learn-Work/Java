import java.util.Scanner;

class FibonacciSeries {
    static int printFibo(int n){
        // Base Case
        if(n==0 || n==1){
            return n;
        }
        // Rec Case
        int sum = printFibo(n-1) + printFibo(n-2);
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        while(i<n){
            System.out.println(printFibo(i));
            i++;
        }
    }
}