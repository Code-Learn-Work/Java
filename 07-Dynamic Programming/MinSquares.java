import java.util.Scanner;

public class MinSquares{

    public static int minSquares(int n){
        // Create an array of size+1 for
        // storing the square values
        int dp[] = new int[n+1];

        // Assign the same values for n<=3
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for(int i=4;i<=n;i++){
            dp[i] = i;
            for(int j=1;j<=i;j++){
                int temp = j*j;
                if(temp>i){
                    break;
                }
                else{
                    dp[i] = Math.min(dp[i], 1+dp[i-temp]);
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Minimu number of squares for " + n + " : " + minSquares(n));
        sc.close();
    }
}