import java.util.Scanner;

class StringToInteger{
    public static int ans = 0;
    public static int count = 0;
    public static int convert(String s){
        if(s.length()==1){
            ans = (ans*10) + Integer.parseInt(s.substring(0, 1));
            return ans;
        }
        else{
            ans = (ans*10) + Integer.parseInt(s.substring(0,1));
            count++;
            return convert(s.substring(1, s.length()));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = convert(s);
        System.out.println(n);
        sc.close();
    }
}