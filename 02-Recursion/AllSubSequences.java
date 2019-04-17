package recursion;

public class AllSubSequences {
	public static String[] findSubsequences(String s) {
		// Base Case
		if(s.length()<=0) {
			String ans[] = {""};
			return ans;
		}
		
		// Recursive Case
		String smallAns[] = findSubsequences(s.substring(1));
		String ans[] = new String[2*smallAns.length];
		
		// Loop to copy data
		for(int i=0;i<smallAns.length;i++) {
			ans[i] = smallAns[i];
		}
		
		// Loop to add new data
		for(int i=0;i<smallAns.length;i++) {
			ans[i+smallAns.length] = s.charAt(0) + smallAns[i];
		}
		
		return ans;
		
	}
	public static void main(String[] args) {
		String str = "xyz";
		String result[] = findSubsequences(str);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
}
