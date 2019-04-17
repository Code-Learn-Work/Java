package recursion;

public class CoinChangeComb {
	
	public static String[] coinChangeCombination(int arr[],int amount) {
		
		// Base Case
		if(amount==0) {
			String[] ar =  {" "};
			return ar;
		}
		if(amount<0) {
			String[] ar = new String[0];
			return ar;
		}
		
		// Recursive Case
		String a1[] = coinChangeCombination(arr, amount-arr[0]);
		for(int i=0;i<a1.length;i++) {
			a1[i] = arr[0] + a1[i] + " ";
		}
		String a2[] = coinChangeCombination(arr, amount-arr[1]);
		for(int i=0;i<a2.length;i++) {
			a2[i] = arr[1] + a2[i] + " ";
		}
		String a3[] = coinChangeCombination(arr, amount-arr[2]);
		for(int i=0;i<a3.length;i++) {
			a3[i] = arr[2] + a3[i] + " ";
		}
		String a4[] = coinChangeCombination(arr, amount-arr[3]);
		for(int i=0;i<a4.length;i++) {
			a4[i] = arr[3] + a4[i] + " ";
		}
		
		String a5[] = new String[a1.length + a2.length + a3.length + a4.length];
		int k=0;
		for(int i=0;i<a1.length;i++) {
			a5[k] = a1[i];
			k++;
		}
		for(int i=0;i<a2.length;i++) {
			a5[k] = a2[i];
			k++;
		}
		for(int i=0;i<a3.length;i++) {
			a5[k] = a3[i];
			k++;
		}
		for(int i=0;i<a4.length;i++) {
			a5[k] = a4[i];
			k++;
		}
		
		return a5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,5,6};
		int amt = 10;
		String[] output = coinChangeCombination(arr, amt);
		for(int i=0;i<output.length;i++) {
			System.out.println(output[i]);
		}
		

	}

}
