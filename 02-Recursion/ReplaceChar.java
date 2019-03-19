import java.util.Scanner;

class ReplaceChar{
    public static String replaceChar(String s){
        // Base Case
        if(s.length()<1)
            return s;
        
        // Recursive Case
        String ans = "";
        if(s.charAt(0)!='x'){
            ans+=s.charAt(0);
        }
        
        String smallAns = replaceChar(s.substring(1));
        return ans + smallAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(replaceChar(s));
        sc.close(); 
    }
}