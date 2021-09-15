
import java.util.Arrays;

public class Hw1 {
	
	public static void find(int[] a, int x) {
		// implement this method

		int identicalIn = 0;
		for(int i = 0; i < a.length - 1; i++){
			if (a[i] == x){
				System.out.println(x +"is in a[" + i+ "]");
				identicalIn++;
			}
		}
		if(identicalIn ==0 ){
			System.out.println(x + " does not exit");
		}
	}
	
	public static int[] subarray(int[] a, int low, int high) {
		// implement this method
		int[] newArr = new int[high - low+ 1];
		int j = 0;
		for(int i = low; i <= high; i++ ){
			 newArr[j] = a[i];
			 j++;
			}
		return newArr;
	}
	
	public static boolean isPrefix(String s1, String s2) {
		// implement this method
		int i = 0;
		int j = 0;
		while (i < s1.length()) {
			if (s1.charAt(i) == s2.charAt(i)) {
				j++;
			}
			i++;
		}
		if(j == s1.length()){
			return true;
		}
		 return false;
	}
	
	public static void main(String[] args) {
		
		int[] a = {5, 3, 5, 6, 1, 2, 12, 5, 6, 1};
		
		find(a, 5);
		find(a, 10);
		System.out.println();
		
		int low = 1;
		int high = 6;
		
		int[] subarray = new int[high-low+1];
		subarray = subarray(a, low, high);
		System.out.println("a[" + low + ".." + high +"] = " + Arrays.toString(subarray));
		System.out.println();
		
		String s1 = "abc";
		String s2 = "abcde";
		String s3 = "abdef";
		
		if (isPrefix(s1,s2)) {
			System.out.println(s1 + " is a prefix of " + s2);
		}
		else {
			System.out.println(s1 + " is not a prefix of " + s2);
		}
		
		if (isPrefix(s1,s3)) {
			System.out.println(s1 + " is a prefix of " + s3);
		}
		else {
			System.out.println(s1 + " is not a prefix of " + s3);
		}
		
	}

}