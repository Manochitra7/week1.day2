package javaAssignment;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,7,6,8};
		int length = arr.length;
		System.out.println("length of array="+length);
		// sorting Arrays
		Arrays.sort(arr);
		//arr.length-1= last element of array
		for(int i=1; i<=arr.length-1;i++) {
			if ((i)!=arr[i-1]) {
				System.out.println("missing Element=" +i);
				break;
			}

	}
}
	}
