package RBCCoding;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		int arr[] = { 1, 1,1,2,3 };
		System.out.println(duplicatenumber(arr));
	}
	
	public static int duplicatenumber(int arr[]) {
		
		Set<Integer> store = new HashSet<>(); 
		for (Integer x : arr) { 
			if (store.add(x) == false) { 
				return x;
				} 
			}
		return -1;

	}

}
