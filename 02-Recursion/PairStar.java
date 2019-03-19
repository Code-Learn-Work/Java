import java.util.Scanner;

class PairStar{
    private static String addStars(String s,String ans,int i){
        ans = ans + s.charAt(i);
        // Base Case
        if(i==s.length()-1){
            return ans;
        }

        // Rec Case
        if(s.charAt(i)==s.charAt(i+1)){
            ans = ans + '*';
            // System.out.println(ans);
        }

        return addStars(s,ans,i+1);
    }

    public static String addStars(String s){
        String ans = new String();
        
        ans = addStars(s,ans,0);
        // System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = addStars(s);
        System.out.println(a);
        sc.close();
    }
}