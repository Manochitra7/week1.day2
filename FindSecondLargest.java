package week1.d1;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int [] data= {3,2,11,4,6,7};
   // Sorting data
   Arrays.sort(data);
   // getting length of array
   int length = data.length;
   System.out.println("Second largest is " + data [length-2]);
	}

}
