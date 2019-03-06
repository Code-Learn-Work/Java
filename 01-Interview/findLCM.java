import java.util.Scanner;

class FindLCM{
    static int findLCM(int a,int b){
        int max = Math.max(a, b);
        while(true){
            if(max%a==0 && max%b==0){
                return max;
            }
            max++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The LCM of " + a + " and " + b + " : " + findLCM(a, b));
        sc.close();
    }
}