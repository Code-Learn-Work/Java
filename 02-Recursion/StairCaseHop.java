package recursion;

public class StairCaseHop {

	public static int stairCaseHop(int n) {
		if(n==1)
			return 1;
		else if(n==2)
			return 2;
		else if(n==3) {
			return 4;
		}
		
		else {
			return stairCaseHop(n-1) + stairCaseHop(n-2) + stairCaseHop(n-3);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stairCaseHop(4));
	}

}
