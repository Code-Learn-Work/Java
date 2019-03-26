import java.util.Scanner;

class RemoveConsecutive{
    public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
        
        // Base Case
        if(s.length()<=1)
            return s;
        
        // Rec Case
        if(s.charAt(0)==s.charAt(1))
            return removeConsecutiveDuplicates(s.substring(1));
        else
            return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeConsecutiveDuplicates(s));   
        sc.close();
    }
}